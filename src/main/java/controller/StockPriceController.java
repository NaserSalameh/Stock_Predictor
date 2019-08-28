package controller;

import controller.extractors.CompanyExtractor;
import model.Company;
import model.Predictor;
import model.PredictorData;
import view.StockPriceGUI;

import javax.swing.*;

public class StockPriceController {

    private JTextArea stockPriceTextArea;
    private JTextField companySymbolTextField;
    private StockTest stockTest;
    private  PredictorData data;

    private CompanyExtractor companyExtractor;

    public StockPriceController(StockPriceGUI stockPriceGUI, PredictorData data){

        this.stockTest = new StockTest();

        this.stockPriceTextArea = stockPriceGUI.getStockPriceTextArea();
        this.companySymbolTextField = stockPriceGUI.getStockSymbolTextField();

        this.data = data;

        this.companyExtractor = new CompanyExtractor(data);

    }

    public void getPrice(){

        //change stocktest to ApiCall
        //String callReturn = stockTest.getStockDetail(SYMBOL);
        String callReturn = stockTest.getStockDetail();
        Company requestedCompany = companyExtractor.extract(callReturn);

        data.addCompany(requestedCompany);

        stockPriceTextArea.setText("Company: " + requestedCompany.getShortName() + "\n" + "Share Price: "+ requestedCompany.getPrice());
    }

}
