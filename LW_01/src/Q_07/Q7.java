package Q_07;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Date today = new Date();
        SimpleDateFormat dmy = new SimpleDateFormat("hh:mm:ss a.");

        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setTitle(dmy.format(today));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
