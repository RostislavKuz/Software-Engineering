import java.util.Date;
import java.util.Scanner;

public class DigitsLettersAndOther_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char firstChar = text.charAt(i);
            if (Character.isDigit(firstChar)) {
                System.out.print(firstChar);
            }
        }

        System.out.println();
        for (int i = 0; i < text.length(); i++) {
            char firstChar = text.charAt(i);
            if (Character.isLetter(firstChar)) {
                System.out.print(firstChar);
            }
        }
        System.out.println();
        for (int i = 0; i < text.length(); i++) {
            char firstChar = text.charAt(i);
            if (!Character.isDigit(firstChar) && !Character.isLetter(firstChar)) {
                System.out.print(firstChar);
            }
        }


    }
}
