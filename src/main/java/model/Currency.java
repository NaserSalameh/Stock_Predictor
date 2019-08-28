package model;

public class Currency {

    private String name;
    private String region;
    private String symbol;

    public Currency(String name, String region, String symbol){
        this.name=name;
        this.region=region;
        this.symbol=symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
