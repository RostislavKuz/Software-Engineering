import java.util.Scanner;

public class VegetableMarket_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vegetablesPrice = Double.parseDouble(scanner.nextLine());
        double fruitsPrice = Double.parseDouble(scanner.nextLine());
        int totalKilosOfVegetables = Integer.parseInt(scanner.nextLine());
        int totalKilosOfFruits = Integer.parseInt(scanner.nextLine());

        double totalPriceInEuro = ((vegetablesPrice * totalKilosOfVegetables) + (fruitsPrice * totalKilosOfFruits)) / 1.94;

        System.out.printf("%.2f", totalPriceInEuro);

    }
}
