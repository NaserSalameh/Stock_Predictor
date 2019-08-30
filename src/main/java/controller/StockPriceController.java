package controller;

import controller.extractors.CompanyExtractor;
import model.Company;
import model.PredictorData;
import view.StockPriceGUI;

import javax.swing.*;

public class StockPriceController {

    private JTextArea stockPriceTextArea;
    private JTextField companySymbolTextField;
    private StockTest stockTest;
    private JList companyList;
    private DefaultListModel model;

    private  PredictorData data;

    private CompanyExtractor companyExtractor;

    public StockPriceController(StockPriceGUI stockPriceGUI, PredictorData data){

        this.stockTest = new StockTest();

        this.stockPriceTextArea = stockPriceGUI.getStockPriceTextArea();
        this.companySymbolTextField = stockPriceGUI.getCompanySymbolTextField();
        this.companyList = stockPriceGUI.getCompanyList();

        this.data = data;

        this.companyExtractor = new CompanyExtractor(data);

        model = new DefaultListModel();
        companyList.setModel(model);

        for(Company c: data.getCompanies())
            model.add(model.getSize(),c.getShortName());

    }

    public void getCompanyPrice(String companyName){

        String symbol="";

        for(Company c: data.getCompanies())
            if (c.getShortName().equals(companyName))
                symbol = c.getSymbol();

        String callReturn = stockTest.getStockDetail(symbol);
        Company requestedCompany = companyExtractor.extract(callReturn);

        stockPriceTextArea.setText("Company: " + requestedCompany.getShortName() + "\n" + "Share Price: "+ requestedCompany.getPrice());
    }

    public void getNewCompanyPrice(String symbol){

        String callReturn = stockTest.getStockDetail(symbol);
        Company requestedCompany = companyExtractor.extract(callReturn);
        data.addCompany(requestedCompany);

        model.add(model.getSize(),requestedCompany.getShortName());

        stockPriceTextArea.setText("Company: " + requestedCompany.getShortName() + "\n" + "Share Price: "+ requestedCompany.getPrice());
    }

    public void removeCompany(){
        Company tempCompany = null;
        for(Company c: data.getCompanies())
            if(c.getShortName().equals(companyList.getSelectedValue().toString()))
                tempCompany = c;

        data.getCompanies().remove(tempCompany);

        model.remove(companyList.getSelectedIndex());
    }

}
