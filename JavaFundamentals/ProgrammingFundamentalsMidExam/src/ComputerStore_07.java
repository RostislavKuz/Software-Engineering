import java.util.Scanner;

public class ComputerStore_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double totalPriceWithoutTaxes = 0;
        double totalPriceWithTaxes = 0;
        double totalPrice = 0;
        double taxes = 0;

        while (true) {
            if (command.equals("special") || command.equals("regular")) {
                break;
            }
            double price = Double.parseDouble(command);

            if (price < 0) {
                System.out.println("Invalid price!");
            } else {
                totalPriceWithoutTaxes += price;
            }
            command = scanner.nextLine();
        }

        if (totalPriceWithoutTaxes > 0) {
            taxes = totalPriceWithoutTaxes * 0.2;
            totalPriceWithTaxes = totalPriceWithoutTaxes + taxes;

            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", totalPriceWithoutTaxes);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            if (command.equals("special")) {
                totalPrice = totalPriceWithTaxes * 0.9;
                System.out.printf("Total price: %.2f$%n", totalPrice);
            } else {
                System.out.printf("Total price: %.2f$%n", totalPriceWithTaxes);
            }
        } else {
            System.out.println("Invalid order!");
        }
    }
}
