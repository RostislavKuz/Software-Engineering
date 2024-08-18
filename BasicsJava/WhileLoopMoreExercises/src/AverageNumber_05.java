import java.util.Scanner;

public class AverageNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int sum = 0;

        while (counter < n) {
            int input = Integer.parseInt(scanner.nextLine());
            sum += input;

            counter++;
        }

        System.out.printf("%.2f", sum * 1.0 / counter);
    }
}
