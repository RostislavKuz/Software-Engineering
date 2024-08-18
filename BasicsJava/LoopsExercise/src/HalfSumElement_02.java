import java.util.Scanner;

public class HalfSumElement_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number > max) {
                max = number;
            }

            sum += number;
        }

        sum -= max;

        int diff = Math.abs(sum - max);

        if (diff == 0) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", max);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }
    }
}
