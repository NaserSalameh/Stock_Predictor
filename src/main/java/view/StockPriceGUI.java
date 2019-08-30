package view;

import controller.StockPriceController;
import model.PredictorData;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StockPriceGUI extends JPanel{
    private JPanel rootPanel;

    private JTextArea stockPriceTextArea;
    private JTextField companySymbolTextField;
    private JButton getStockPriceButton;
    private JList companyList;
    private JButton removeButton;

    public StockPriceGUI(PredictorData data){

        add(rootPanel);

        final StockPriceController stockPriceController = new StockPriceController(this,data);

        companyList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                stockPriceController.getCompanyPrice(String.valueOf(companyList.getSelectedValue()));
            }
        });

        getStockPriceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stockPriceController.getNewCompanyPrice(companySymbolTextField.getText());
            }
        });

        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stockPriceController.removeCompany();
            }
        });
    }

    public JTextArea getStockPriceTextArea() {
        return stockPriceTextArea;
    }

    public JTextField getCompanySymbolTextField() {
        return companySymbolTextField;
    }

    public JList getCompanyList(){ return this.companyList;}
}

