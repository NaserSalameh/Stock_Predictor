package controller.parsers;

import model.Company;
import model.Currency;
import model.PredictorData;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.*;


public class CompanyParser {


    public CompanyParser(){
    }

    public void parse(Sheet sheet, PredictorData data) {

        String[] companyData = new String[10];
        for (Row row: sheet)
            for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
                companyData[i] = row.getCell(i).getStringCellValue();

            Company newCompany = new Company(companyData[0],companyData[1],companyData[2],companyData[3],companyData[4],
                    companyData[5],companyData[6],companyData[7]);

            for(Currency c: data.getCurrencies())
                if(c.getName().equals(companyData[8]))
                    newCompany.setCurrency(c);

            newCompany.setPrice(companyData[9]);

            data.getCompanies().add(newCompany);
        }
    }
}
