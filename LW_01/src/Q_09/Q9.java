package Q_09;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Sentence :");
        String sentence = scanner.nextLine();

        int charLength = sentence.length();
        System.out.println(charLength);
        System.out.println(sentence.substring(0,1));
        System.out.println(sentence.substring(charLength-1,charLength));

    }
}
