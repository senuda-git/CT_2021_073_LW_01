package Q_10;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter an odd-length word : ");
        String text = scanner.nextLine();

        if(text.length() % 2 == 1){
            int textMiddle = text.length() / 2;
            char middleCharacter = text.charAt(textMiddle);
            System.out.println("Middle Character is : " + middleCharacter);
        } else System.out.println("Not an odd-length word.");
    }
}
