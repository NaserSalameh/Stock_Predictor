package controller.extractors;


import model.Company;
import model.Currency;
import model.Predictor;
import model.PredictorData;

//used to extract Companies from API calls
public class CompanyExtractor {

    //keywords to extract from string
    private String[] keywords;

    private PredictorData data;

    public CompanyExtractor(PredictorData data){

        //keywords[0] = symbol,
        //keywords[1] = region,
        //keywords[2] = language,
        //keywords[3] = market,
        //keywords[4] = shortName,
        //keywords[5] = longName,
        //keywords[6] = sector,
        //keywords[7] = longBusinessSummary,
        //keywords[8] = financialCurrency,
        //keywords[9] = price,

        keywords = new String[]{"symbol\":\"","region\":\"","language\":\"",",\"market\":\"","shortName\":\"",
                "longName\":\"","sector\":\"","longBusinessSummary\":\"","financialCurrency\":\"",
                "price\":{\"quoteSourceName\":\"Delayed Quote\",\"regularMarketOpen\":{\"raw\":"};

        this.data = data;
    }

    public Company extract(String callReturn){

        String[] companyData = new String[10];
        for(int i=0;i<keywords.length;i++){
            companyData[i] = callReturn.substring(callReturn.indexOf(keywords[i])+ keywords[i].length());
            companyData[i] = companyData[i].substring(0,companyData[i].indexOf("\""));
        }

        Company newCompany = new Company(companyData[0],companyData[1],companyData[2],companyData[3],companyData[4],
                companyData[5],companyData[6],companyData[7]);

        for(Currency c: data.getCurrencies())
            if (c.getName().equals(companyData[8]))
                newCompany.setCurrency(c);

        newCompany.setPrice(companyData[9].replaceAll(",",""));

        return (newCompany);
    }
}
