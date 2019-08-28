package controller.writers;

import model.Company;
import model.PredictorData;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writer {

    private HSSFWorkbook workbook;

    private CompanyWriter companyWriter;

    public Writer(){

        workbook = new HSSFWorkbook();

        companyWriter = new CompanyWriter(workbook.createSheet("Companies"));
    }

    public void write(PredictorData data){

        companyWriter.write(data);


        try{
            FileOutputStream out = new FileOutputStream(new File("PredictorData.xls"));
            workbook.write(out);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
