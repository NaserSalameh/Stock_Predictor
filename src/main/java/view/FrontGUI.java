package view;

import model.PredictorData;

import javax.swing.*;

public class FrontGUI extends JFrame {

    private JTabbedPane tabbedPane;

    private ParserWriterGUI parserWriterGUI;
    private StockPriceGUI stockPriceGUI;


    public FrontGUI(PredictorData data){

        setSize(500,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        parserWriterGUI = new ParserWriterGUI(this, data);
        stockPriceGUI = new StockPriceGUI(data);

        tabbedPane = new JTabbedPane();
        add(tabbedPane);

        tabbedPane.add("Parse/Write Data" , parserWriterGUI);
        tabbedPane.add("Stock Price Search" , stockPriceGUI);



        setVisible(true);
    }

}
