import java.util.Scanner;

public class HappyCatParking_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double totalSum = 0;

        for (int i = 1; i <= days; i++) {
            double sumPerDay = 0;
            for (int j = 1; j <= hours; j++) {

                if (i % 2 == 0 && j % 2 != 0) {
                    sumPerDay += 2.50;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    sumPerDay += 1.25;
                } else {
                    sumPerDay += 1;
                }

            }
            System.out.printf("Day: %d - %.2f leva%n", i, sumPerDay);
            totalSum += sumPerDay;
        }

        System.out.printf("Total: %.2f leva", totalSum);
    }
}
