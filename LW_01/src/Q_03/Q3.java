package Q_03;

import javax.swing.*;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Scanner scanner = new Scanner(System.in);

        String firstName;
        System.out.println("Enter Your First Name");
        firstName = scanner.next();
        String middleName;
        System.out.println("Enter Your Middle Name");
        middleName = scanner.next();
        String lastName;
        System.out.println("Enter Your Last Name");
        lastName = scanner.next();

        String initial = new String(middleName.substring(0,1));


        System.out.println(firstName + " " + initial + ". " + lastName);

    }
}
