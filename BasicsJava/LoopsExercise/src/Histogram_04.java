import java.util.Scanner;

public class Histogram_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int firstCount = 0;
        int secondCount = 0;
        int thirdCount = 0;
        int fourthCount = 0;
        int fifthCount = 0;

        for (int i = 0; i < n; i++) {

            int number = Integer.parseInt(scanner.nextLine());

            if (number < 200) {
                firstCount++;
            } else if (number <= 399) {
                secondCount++;
            } else if (number <= 599) {
                thirdCount++;
            } else if (number <= 799) {
                fourthCount++;
            } else {
                fifthCount++;
            }
        }

        double p1 = firstCount * 1.0 / n * 100;
        double p2 = secondCount * 1.0 / n * 100;
        double p3 = thirdCount * 1.0 / n * 100;
        double p4 = fourthCount * 1.0 / n * 100;
        double p5 = fifthCount * 1.0 / n * 100;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);
        System.out.printf("%.2f%%%n", p5);
    }
}
