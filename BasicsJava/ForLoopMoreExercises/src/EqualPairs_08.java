import java.util.Scanner;

public class EqualPairs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int oldSum = 0;
        int newSum = 0;

        int diff = 0;
        int maxDiff = diff;

        for (int i = 0; i < n; i++) {

            int firstNumber = Integer.parseInt(scanner.nextLine());
            int secondNumber = Integer.parseInt(scanner.nextLine());

            oldSum = newSum;
            newSum = firstNumber + secondNumber;


            if (oldSum > newSum) {
                diff = oldSum - newSum;
            } else {
                diff = newSum - oldSum;
            }


            if (maxDiff < diff) {
                maxDiff = diff;
            }

        }

        if (n == 1) {
            System.out.printf("Yes, value=%d", newSum);
        } else if (oldSum == newSum) {
            System.out.printf("Yes, value=%d", newSum);
        } else {
            System.out.printf("No, maxdiff=%d%n", Math.abs(maxDiff));
        }


    }
}
