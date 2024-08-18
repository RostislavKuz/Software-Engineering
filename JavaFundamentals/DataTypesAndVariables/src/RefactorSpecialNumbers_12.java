import java.util.Scanner;

public class RefactorSpecialNumbers_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int numbers = 0;

        for (int num = 1; num <= n; num++) {
            int sumOfNumbers = 0;
            numbers = num;
            while (num > 0) {
                sumOfNumbers += num % 10;
                num = num / 10;
            }

            boolean isSpecial = (sumOfNumbers == 5) || (sumOfNumbers == 7) || (sumOfNumbers == 11);

            if (isSpecial) {
                System.out.printf("%d -> True%n", numbers);
            } else {
                System.out.printf("%d -> False%n", numbers);
            }
            num = numbers;
        }

    }
}
