package lambdas.ch1;

import java.text.SimpleDateFormat;

import javax.swing.text.DateFormatter;


public class Question2 {

    public static void main(String[] args) {
        Question2 q = new Question2();
        q.formatter.get();

    }

    public final static ThreadLocal<DateFormatter> formatter = ThreadLocal.withInitial(() -> new DateFormatter(new SimpleDateFormat("dd-MMM-yyyy")));


}
