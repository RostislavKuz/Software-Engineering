import java.util.Scanner;

public class EqualSumsEvenOddPosition_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());


        for (int i = start; i <= end; i++) {
            int evenSum = 0;
            int oddSum = 0;

            boolean isEvenPosition = true;
            int currentNumber = i;

            while (currentNumber > 0) {
                int lastDigit = currentNumber % 10;

                if (isEvenPosition) {
                    evenSum += lastDigit;
                    isEvenPosition = false;
                } else {
                    oddSum += lastDigit;
                    isEvenPosition = true;
                }


                currentNumber /= 10;
            }

            if (evenSum == oddSum) {
                System.out.printf("%d ", i);
            }

        }

    }
}
