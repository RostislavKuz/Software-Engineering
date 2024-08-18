import java.util.Scanner;

public class SumPrimeNonPrime_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int primeNumbersSum = 0;
        int nonPrimeNumbersSum = 0;

        while (!input.equals("stop")) {

            int number = Integer.parseInt(input);

            if (number < 0) {
                System.out.println("Number is negative.");
            } else {

                boolean isPrime = true;

                for (int i = 2; i < number; i++) {

                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    primeNumbersSum += number;
                } else {
                    nonPrimeNumbersSum += number;
                }
            }

            input = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n", primeNumbersSum);
        System.out.printf("Sum of all non prime numbers is: %d %n", nonPrimeNumbersSum);
    }
}
