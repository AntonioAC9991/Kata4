package controller;

import model.Histogram;
import model.MailHistogramBuilder;
import model.MailListReader;
import view.HistogramDisplay;
import view.Mail;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "D:\\NetBeansApplications\\Kata4\\email.txt";
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram<String> histo = MailHistogramBuilder.build(mailList);;
        HistogramDisplay histogramDisplay= new HistogramDisplay(histo);
        histogramDisplay.execute();
    }
}