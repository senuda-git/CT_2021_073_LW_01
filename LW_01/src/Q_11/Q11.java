package Q_11;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name (First Middle Last Format) : ");
        String fullName = scanner.nextLine();

        String[] NameParts = fullName.split(" ");

        System.out.println(NameParts[2] + " " + NameParts[0] + " " + NameParts[1].charAt(0) + ".");

    }
}
