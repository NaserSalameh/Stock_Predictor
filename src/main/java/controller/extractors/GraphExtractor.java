package controller.extractors;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class GraphExtractor {

    public GraphExtractor(){

    }

    public HashMap<String,String[]> extractGraph(String callReturn){

        String timestamps= callReturn.substring(callReturn.indexOf("timestamp\":[")+12);
        timestamps = timestamps.substring(0,timestamps.indexOf("]"));

        String volumes= callReturn.substring(callReturn.indexOf("volume\":[")+9);
        volumes= volumes.substring(0,volumes.indexOf("]"));

        String highs= callReturn.substring(callReturn.indexOf("high\":[")+7);
        highs= highs.substring(0,highs.indexOf("]"));

        String closes= callReturn.substring(callReturn.indexOf("close\":[")+8);
        closes= closes.substring(0,closes.indexOf("]"));

        String lows= callReturn.substring(callReturn.indexOf("low\":[")+6);
        lows= lows.substring(0,lows.indexOf("]"));

        String[] timeStampsArray = timestamps.split(",");

        String[] volumesArray = volumes.split(",");

        String[] highsArray = highs.split(",");

        String[] closesArray = closes.split(",");

        String[] lowsArray = lows.split(",");


        //map of timestamp to values
        LinkedHashMap<String,String[]> timeStampValues = new LinkedHashMap<String, String[]>();

        for(int i=0;i<timeStampsArray.length;i++){
            String[] values = {volumesArray[i],highsArray[i],closesArray[i],lowsArray[i]};
            timeStampValues.put(timeStampsArray[i],values);
        }


//        for(Map.Entry<String,String[]> entry: timeStampValues.entrySet())
//            System.out.println("Time: " + entry.getKey() + " Volume: " + entry.getValue()[0] + ", High: " + entry.getValue()[1] +
//                    ", Close: " + entry.getValue()[2] + ", Low: " + entry.getValue()[3]);

        return  timeStampValues;
    }

}
