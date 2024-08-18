import java.util.Scanner;

public class DivideWithoutRemainder_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int firstCount = 0;
        int secondCount = 0;
        int thirdCount = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0) {
                firstCount++;
            }
            if (number % 3 == 0) {
                secondCount++;
            }
            if (number % 4 == 0) {
                thirdCount++;
            }
        }
        double p1 = firstCount * 1.0 / n * 100;
        double p2 = secondCount * 1.0 / n * 100;
        double p3 = thirdCount * 1.0 / n * 100;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);


    }
}
