package model;

import sun.util.calendar.BaseCalendar;

public class HistoricalData {

    //the company referred to
    private Company company;

    //the period start of the historical data
    private String startPeriod;

    private BaseCalendar.Date startDate;

    //the period end of the historical data
    private String endPeriod;

    private BaseCalendar.Date endDate;

    private String frequency;

    //move to controller
    private final String[] possibleFrequency = new String[]{"1d","1wk","1mo"};

    private int gmtOffset;

    public HistoricalData(Company company, String startPeriod, String endPeriod){

    }


    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getStartPeriod() {
        return startPeriod;
    }

    public void setStartPeriod(String startPeriod) {
        this.startPeriod = startPeriod;
    }

    public BaseCalendar.Date getStartDate() {
        return startDate;
    }

    public void setStartDate(BaseCalendar.Date startDate) {
        this.startDate = startDate;
    }

    public String getEndPeriod() {
        return endPeriod;
    }

    public void setEndPeriod(String endPeriod) {
        this.endPeriod = endPeriod;
    }

    public BaseCalendar.Date getEndDate() {
        return endDate;
    }

    public void setEndDate(BaseCalendar.Date endDate) {
        this.endDate = endDate;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public int getGmtOffset() {
        return gmtOffset;
    }

    public void setGmtOffset(int gmtOffset) {
        this.gmtOffset = gmtOffset;
    }

    public int[] getPrices() {
        return prices;
    }

    public void setPrices(int[] prices) {
        this.prices = prices;
    }

    int[] prices;



}
