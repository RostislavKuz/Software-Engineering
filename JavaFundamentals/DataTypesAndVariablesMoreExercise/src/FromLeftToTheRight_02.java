import java.util.Scanner;

public class FromLeftToTheRight_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            long leftNumber = Long.parseLong(input[0]);
            long rightNumber = Long.parseLong(input[1]);

            long leftFullNumber = leftNumber;
            long rightFullNumber = rightNumber;

            int leftSum = 0;
            int rightSum = 0;

            leftNumber = Math.abs(leftNumber);
            while (leftNumber > 0) {
                leftSum += leftNumber % 10;
                leftNumber /= 10;
            }
            rightNumber = Math.abs(rightNumber);
            while (rightNumber > 0) {
                rightSum += rightNumber % 10;
                rightNumber /= 10;
            }

            if (leftFullNumber > rightFullNumber) {
                System.out.println(leftSum);
            } else {
                System.out.println(rightSum);
            }

        }

    }
}
