package view;

import controller.ParserWriterController;
import model.PredictorData;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ParserWriterGUI extends JPanel{
    private JButton parserButton;
    private JButton writeButton;
    private JPanel rootPanel;
    private JTextPane textPane1;

    public ParserWriterGUI(final PredictorData data){

        add(rootPanel);

        final ParserWriterController parserWriterController = new ParserWriterController();

        parserButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                parserWriterController.parse(data);
                textPane1.setText("Parsed Data.");
            }
        });

        writeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                parserWriterController.write(data);
                textPane1.setText("Wrote Data.");
            }
        });

    }

}
