import java.util.Scanner;

public class GameOfIntervals_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int steps = Integer.parseInt(scanner.nextLine());

        double result = 0;

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;

        for (int i = 0; i < steps; i++) {

            int number = Integer.parseInt(scanner.nextLine());

            if (number >= 0 && number <= 9) {
                result += number * 0.2;
                count1++;
            } else if (number >= 10 && number <= 19) {
                result += number * 0.3;
                count2++;
            } else if (number >= 20 && number <= 29) {
                result += number * 0.4;
                count3++;
            } else if (number >= 30 && number <= 39) {
                result += 50;
                count4++;
            } else if (number >= 40 && number <= 50) {
                result += 100;
                count5++;
            } else {
                result /= 2;
                count6++;
            }
        }

        System.out.printf("%.2f%n", result);
        System.out.printf("From 0 to 9: %.2f%%%n", count1 * 1.0 / steps * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", count2 * 1.0 / steps * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", count3 * 1.0 / steps * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", count4 * 1.0 / steps * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", count5 * 1.0 / steps * 100);
        System.out.printf("Invalid numbers: %.2f%%%n", count6 * 1.0 / steps * 100);
    }
}
