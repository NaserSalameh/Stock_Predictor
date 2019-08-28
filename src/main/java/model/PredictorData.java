package model;

import java.util.ArrayList;

public class PredictorData {

    private ArrayList<Company> companies;
    private ArrayList<Currency> currencies;


    public PredictorData(){
        companies = new ArrayList<Company>();
        currencies = new ArrayList<Currency>();
        initialiseCurrencies();
    }

    private void initialiseCurrencies(){
        currencies.add(new Currency("USD","USA", "$"));
        currencies.add(new Currency("Euro", "European Union", "€"));
        currencies.add(new Currency("British Pound", "United Kingdoms", "£"));
        currencies.add(new Currency("Japanese Yen","Japan","¥"));
    }

    private boolean companyExists(Company company){
        if(companies.contains(company))
            return true;
        else
            return false;
    }

    public boolean addCompany(Company company){
        if(companyExists(company))
            return false;
        else{
            companies.add(company);
            return true;
        }
    }

    public ArrayList<Company> getCompanies() {
        return companies;
    }

    public ArrayList<Currency> getCurrencies() {
        return currencies;
    }
}
