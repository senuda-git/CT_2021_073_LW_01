package Q_08;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your phrase");
        String phrase = scanner.nextLine();

        int exclamationPlace = phrase.indexOf('!');

        String before = phrase.substring(0,exclamationPlace);
        String after = phrase.substring(exclamationPlace+1);

        System.out.println(before);
        System.out.println(after);


    }
}
