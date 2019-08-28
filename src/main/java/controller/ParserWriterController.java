package controller;

import controller.parsers.Parser;
import controller.writers.Writer;
import model.Predictor;
import model.PredictorData;
import view.ParserWriterGUI;

public class ParserWriterController {

    private Parser parser;
    private Writer writer;

    public ParserWriterController(){

        parser = new Parser();
        writer = new Writer();
    }

    public void parse(PredictorData data){
        parser.parse(data);
    }

    public void write(PredictorData data){
        writer.write(data);
    }

}
