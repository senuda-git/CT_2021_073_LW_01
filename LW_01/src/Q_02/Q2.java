package Q_02;

import javax.swing.*;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Scanner scanner = new Scanner(System.in);

        String firstName;
        System.out.println("Enter Your First Name");
        firstName = scanner.next();
        String lastName;
        System.out.println("Enter Your Last Name");
        lastName = scanner.next();

        frame.setVisible(true);
        frame.setTitle(firstName + " " + lastName);
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
