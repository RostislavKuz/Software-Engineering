package bg.softuni.fundamentals;

import java.util.Scanner;

public class RefactorSumOfOddNumbers_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            System.out.println(2 * i - 1);
            sum += 2 * i - 1;
        }
        System.out.printf("Sum: %d%n", sum);


    }
}
