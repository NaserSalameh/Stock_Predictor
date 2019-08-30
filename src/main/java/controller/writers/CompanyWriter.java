package controller.writers;

import model.Company;
import model.PredictorData;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;


public class CompanyWriter {

    private HSSFSheet sheet;

    public CompanyWriter(HSSFSheet sheet){
        this.sheet = sheet;
    }

    public void write(PredictorData data){

        int rownum =0;
        for(Company c: data.getCompanies()){
            Row row = sheet.createRow(rownum++);

            row.createCell(0).setCellValue(c.getSymbol());
            row.createCell(1).setCellValue(c.getRegion());
            row.createCell(2).setCellValue(c.getLang());
            row.createCell(3).setCellValue(c.getMarket());
            row.createCell(4).setCellValue(c.getShortName());
            row.createCell(5).setCellValue(c.getLongName());
            row.createCell(6).setCellValue(c.getSector());
            row.createCell(7).setCellValue(c.getDescription());
            row.createCell(8).setCellValue(c.getCurrency().getName());
            row.createCell(9).setCellValue(c.getPrice());
        }

    }


}
