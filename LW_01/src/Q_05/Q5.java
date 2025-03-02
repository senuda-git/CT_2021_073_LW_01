package Q_05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q5 {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat dmy = new SimpleDateFormat("EEEE, MMMM dd, yyyy");

        System.out.println(dmy.format(today));
    }
}
