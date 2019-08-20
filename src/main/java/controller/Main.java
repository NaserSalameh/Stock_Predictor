package controller;


public class Main {

    public static void main(String[] args){
        StockTest stockTest = new StockTest();

        System.out.println(stockTest.getSummaryResponse().getBody());
    }

}
