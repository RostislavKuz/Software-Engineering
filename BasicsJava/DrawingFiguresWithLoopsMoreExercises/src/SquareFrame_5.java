import java.util.Scanner;

public class SquareFrame_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char minus = '-';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (j == 1) {
                    if (i != 1 && i != n) {
                        System.out.print("|");
                        System.out.print(" ");
                    } else {
                        System.out.print("+");
                        System.out.print(" ");
                    }
                } else if (j == n) {
                    if (i != n && i != 1) {
                        System.out.print("|");
                    } else {
                        System.out.print("+");
                    }
                }
                if (j != 1 && j != n) {
                    System.out.print("-");
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }
}
