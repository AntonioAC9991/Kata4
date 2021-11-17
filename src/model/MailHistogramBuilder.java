package model;
import view.Mail;
import java.util.List;

/**
 *
 * @author Admin
 */
public class MailHistogramBuilder {
    
    public static Histogram<String> build(List<Mail> list){
        Histogram<String> histo = new Histogram<>();
        for (Mail mail : list) {
            histo.increment(mail.getDomain());
        }
        return histo;
    }
}
