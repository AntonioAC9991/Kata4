package controller;

import model.Histogram;
import model.MailHistogramBuilder;
import model.MailListReader;
import view.HistogramDisplay;
import view.Mail;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<Mail> mailList;
    private Histogram<String> histo;
    private HistogramDisplay histogramDisplay;
    private String fileName;

    public Main(String fileName) {
        this.fileName = fileName;
    }
    public static void main(String[] args) {
        String fileName = "D:\\NetBeansApplications\\Kata4\\email.txt";
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram<String> histo = MailHistogramBuilder.build(mailList);;
        HistogramDisplay histogramDisplay= new HistogramDisplay(histo);

        Main main = new Main("D:\\NetBeansApplications\\Kata4\\email.txt");
        main.execute();

    }

    private void input(){
        mailList = MailListReader.read(fileName);
    }

    private void process(){
        histo = MailHistogramBuilder.build(mailList);;
        histogramDisplay= new HistogramDisplay(histo);
    }

    private void output(){
        histogramDisplay.execute();
    }

    private void execute(){
        input();
        process();
        output();

    }
}