package model;

public class Company {


    //add these to a controller
    private final String[] possibleRegions = new String[]{"AU","CA","FR","DE","HK","US","IT","ES","GB","IN"};

    private final String[] possibleLang = new String[] {"en","fr","de","it","es","zh"};

    private String symbol;
    private String region;
    private String lang;
    private String market;

    private String shortName;
    private String longName;
    private String sector;
    private String description;
    private Currency currency;
    private String price;

    private StockGraph stock;

    public Company(String symbol, String region, String lang, String market, String shortName, String longName, String sector, String description) {
        this.symbol = symbol;
        this.region = region;
        this.lang = lang;
        this.market = market;
        this.shortName = shortName;
        this.longName = longName;
        this.sector = sector;
        this.description = description;
    }


    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public StockGraph getStock() {
        return stock;
    }

    public void setStock(StockGraph stock) {
        this.stock = stock;
    }

    public String getAmount(){
        return (currency.getSymbol() + price);
    }



}
