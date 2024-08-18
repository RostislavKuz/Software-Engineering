import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int increases = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        double sum = 0;

        while (counter < increases) {
            counter++;
            double money = Double.parseDouble(scanner.nextLine());

            if (money < 0) {
                System.out.println("Invalid operation!");
                break;
            } else {
                System.out.printf("Increase: %.2f%n", money);
                sum += money;
            }

        }

        System.out.printf("Total: %.2f", sum);
    }
}
