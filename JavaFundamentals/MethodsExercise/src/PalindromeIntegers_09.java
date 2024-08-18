import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            int number = Integer.parseInt(input);

            checkPalindrome(number);
            input = scanner.nextLine();
        }
    }

    private static void checkPalindrome(int number) {

        if (number == reverseNumber(number)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private static int reverseNumber(int number) {
        int reversedInt = 0;

        while (number > 0) {
            reversedInt = reversedInt * 10 + (number % 10);
            number /= 10;

        }
        return reversedInt;
    }
}
