package view;

import controller.ParserWriterController;
import model.Predictor;
import model.PredictorData;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ParserWriterGUI extends JPanel{
    private JButton parserButton;
    private JButton writeButton;
    private JPanel rootPanel;
    private JTextPane textPane1;

    public ParserWriterGUI(final JFrame parent, final PredictorData data){

        add(rootPanel);

        final ParserWriterController parserWriterController = new ParserWriterController();

        parserButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                parserWriterController.parse(data);
                Predictor newPredictor = new Predictor(data);
                parent.dispose();;
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
