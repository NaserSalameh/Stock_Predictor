package view;

import controller.StockPriceController;
import model.PredictorData;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StockPriceGUI extends JPanel{
    private JPanel rootPanel;

    private JTextArea stockPriceTextArea;
    private JTextField stockSymbolTextField;
    private JButton getStockPriceButton;

    public StockPriceGUI(PredictorData data){

        add(rootPanel);

        final StockPriceController stockPriceController = new StockPriceController(this,data);

        getStockPriceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stockPriceController.getPrice();
            }
        });
    }

    public JTextArea getStockPriceTextArea() {
        return stockPriceTextArea;
    }

    public JTextField getStockSymbolTextField() {
        return stockSymbolTextField;
    }
}
