import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> productQuantity = new LinkedHashMap<>();
        Map<String, Double> prices = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while (!command.equals("buy")) {
            String[] tokens = command.split(" ");

            String productName = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            int quantity = Integer.parseInt(tokens[2]);

            double totalPrice = price * quantity;

            Double currentPrice = prices.get(productName);
            if (currentPrice == null) {
                currentPrice = 0.0;
            }
            prices.put(productName, currentPrice = price);

            Integer currentQuantity = productQuantity.get(productName);
            if (currentQuantity == null) {
                currentQuantity = 0;
            }
            productQuantity.put(productName, currentQuantity + quantity);

            command = scanner.nextLine();
        }

        prices.entrySet().forEach(e -> {
            String name = e.getKey();
            double total = productQuantity.get(name) * prices.get(name);
            System.out.printf("%s -> %.2f%n", name, total);

        });
    }
}
