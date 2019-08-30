package model;

import controller.parsers.Parser;
import controller.writers.Writer;
import view.FrontGUI;

public class Predictor {

    private PredictorData data;

    //for fresh launch
    public Predictor(){

        data = new PredictorData();

        FrontGUI frontGUI = new FrontGUI(data);

    }

    //for relaunch after parsing
    public Predictor(PredictorData data){

        this.data = data;

        FrontGUI frontGUI = new FrontGUI(data);

    }

}
