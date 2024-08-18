import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        double price;
        double totalPrice;

        switch (product) {
            case "coffee":
                price = 1.50;
                totalPrice = getTotalPrice(quantity, price);
                System.out.printf("%.2f", totalPrice);
                break;
            case "water":
                price = 1.00;
                totalPrice = getTotalPrice(quantity, price);
                System.out.printf("%.2f", totalPrice);
                break;
            case "coke":
                price = 1.40;
                totalPrice = getTotalPrice(quantity, price);
                System.out.printf("%.2f", totalPrice);
                break;
            case "snacks":
                price = 2.00;
                totalPrice = getTotalPrice(quantity, price);
                System.out.printf("%.2f", totalPrice);
                break;
        }


    }

    private static double getTotalPrice(int quantity, double price) {
        return quantity * price;
    }
}
