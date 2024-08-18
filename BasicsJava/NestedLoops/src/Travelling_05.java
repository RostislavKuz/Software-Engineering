import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tripDestination = scanner.nextLine();

        while (!tripDestination.equals("End")) {
            double budget = Double.parseDouble(scanner.nextLine());

            while (budget > 0) {
                double deposit = Double.parseDouble(scanner.nextLine());
                budget -= deposit;
            }

            System.out.printf("Going to %s!%n", tripDestination);
            tripDestination = scanner.nextLine();
        }
    }
}
