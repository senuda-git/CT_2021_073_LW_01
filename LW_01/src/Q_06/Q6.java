package Q_06;

import javax.swing.*;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Scanner scanner = new Scanner(System.in);

        int width;
        System.out.println("Enter the width of window");
        width = scanner.nextInt();
        int height;
        System.out.println("Enter the width of window");
        height = scanner.nextInt();

        String title;
        System.out.println("Enter Title of window");
        title = scanner.next();

        frame.setVisible(true);
        frame.setTitle(title);
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
