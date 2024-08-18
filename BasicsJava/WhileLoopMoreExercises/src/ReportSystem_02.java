import java.util.Scanner;

public class ReportSystem_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int needMoney = Integer.parseInt(scanner.nextLine());

        boolean inCash = true;
        int totalMoney = 0;

        int moneyByCash = 0;
        int moneyByCard = 0;

        int cashCount = 0;
        int cardCount = 0;

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            if (inCash) {

                if (Integer.parseInt(input) > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    moneyByCash += Integer.parseInt(input);
                    System.out.println("Product sold!");
                    cashCount++;
                }
                inCash = false;
            } else {
                if (Integer.parseInt(input) < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    moneyByCard += Integer.parseInt(input);
                    System.out.println("Product sold!");
                    cardCount++;
                }
                inCash = true;
            }

            totalMoney = moneyByCard + moneyByCash;

            if (totalMoney >= needMoney) {
                break;
            }

            input = scanner.nextLine();
        }

        double averageMoneyByCard = moneyByCard * 1.0 / cardCount;
        double averageMoneyByCash = moneyByCash * 1.0 / cashCount;

        if (totalMoney >= needMoney) {
            System.out.printf("Average CS: %.2f%n", averageMoneyByCash);
            System.out.printf("Average CC: %.2f%n", averageMoneyByCard);

        } else {
            System.out.println("Failed to collect required money for charity.");
        }

    }
}
