package model;

import controller.parsers.Parser;
import controller.writers.Writer;
import view.FrontGUI;

public class Predictor {

    private PredictorData data;

    public Predictor(){

        data = new PredictorData();

        FrontGUI frontGUI = new FrontGUI(data);

    }

}
