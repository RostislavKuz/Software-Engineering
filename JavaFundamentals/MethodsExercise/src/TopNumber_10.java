import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        getTopNumbers(number);
    }

    private static void getTopNumbers(int number) {

        for (int i = 1; i <= number; i++) {
            boolean sumOfDigits = checkSumOfDigits(i);
            boolean hasOddDigit = checkOddDigit(i);

            if (sumOfDigits && hasOddDigit) {
                System.out.println(i);
            }

        }
    }

    private static boolean checkOddDigit(int number) {

        while (number > 0) {

            int digit = number % 10;

            if (digit % 2 != 0) {
                return true;
            }
            number /= 10;

        }

        return false;
    }

    private static boolean checkSumOfDigits(int number) {

        int sum = 0;

        while (number > 0) {

            sum += number % 10;
            number /= 10;
        }
        if (sum % 8 == 0) {
            return true;
        }
        return false;
    }
}
