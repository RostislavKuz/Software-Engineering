package bg.softuni.fundamentals;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        for (int i = second; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n", first, i, first * second);
        }
        if (second > 10) {
            System.out.printf("%d X %d = %d", first, second, first * second);
        }
    }
}
