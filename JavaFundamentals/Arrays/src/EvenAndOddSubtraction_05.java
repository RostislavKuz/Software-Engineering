import java.util.Scanner;

public class EvenAndOddSubtraction_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbersAsString = scanner.nextLine();
        String[] arrayOfNumbers = numbersAsString.split(" ");

        int[] numbers = new int[arrayOfNumbers.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(arrayOfNumbers[i]);
        }

        int evenSum = 0;
        int oddSum = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }

        int diff = evenSum - oddSum;

        System.out.println(diff);
    }
}
