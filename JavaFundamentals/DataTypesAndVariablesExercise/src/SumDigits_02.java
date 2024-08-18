import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sumOfDigits = 0;

        while (number > 0) {

            int digit = number % 10;
            sumOfDigits += digit;
            number /= 10;
        }

        System.out.println(sumOfDigits);
    }
}
