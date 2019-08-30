package controller.parsers;

import model.Predictor;
import model.PredictorData;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Parser {


    private HSSFWorkbook workbook;

    private CompanyParser companyParser;

    public Parser(){

        companyParser = new CompanyParser();

    }

    public void parse(PredictorData data) {
        try {
            FileInputStream file = new FileInputStream(new File("Predictordata.xls"));
            workbook = new HSSFWorkbook(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        for (Sheet sheet: workbook){
            if (sheet.getSheetName().equals("Companies"))
                companyParser.parse(sheet, data);
        }
    }

}
