import java.util.Scanner;

public class PrimePairs_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int diffFirst = Integer.parseInt(scanner.nextLine());
        int diffSecond = Integer.parseInt(scanner.nextLine());


        for (int i = first; i <= first + diffFirst; i++) {
            for (int j = second; j <= second + diffSecond; j++) {
                boolean isPrimeFirst = true;
                boolean isPrimeSecond = true;

                for (int k = 2; k <= first - 1; k++) {
                    if (i % k == 0) {
                        isPrimeFirst = false;
                        break;
                    }
                }

                for (int k = 2; k <= second - 1; k++) {
                    if (j % k == 0) {
                        isPrimeSecond = false;
                        break;
                    }
                }

                if (isPrimeFirst && isPrimeSecond) {
                    System.out.printf("%d%d%n", i, j);
                }

            }
        }
    }
}
