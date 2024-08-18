import java.util.Scanner;

public class Logistics_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantity = Integer.parseInt(scanner.nextLine());

        int totalWeight = 0;
        int totalPrice = 0;

        int withVan = 0;
        int withTruck = 0;
        int withTrain = 0;


        for (int i = 0; i < quantity; i++) {

            int weight = Integer.parseInt(scanner.nextLine());

            if (weight <= 3) {
                withVan += weight;
            } else if (weight <= 11) {
                withTruck += weight;
            } else if (weight >= 12) {
                withTrain += weight;
            }

            totalWeight += weight;

        }
        totalPrice = withVan * 200 + withTruck * 175 + withTrain * 120;

        double averagePricePerTon = totalPrice * 1.0 / totalWeight;
        double vanPercent = withVan * 1.0 / totalWeight * 100;
        double truckPercent = withTruck * 1.0 / totalWeight * 100;
        double trainPercent = withTrain * 1.0 / totalWeight * 100;

        System.out.printf("%.2f%n", averagePricePerTon);
        System.out.printf("%.2f%%%n", vanPercent);
        System.out.printf("%.2f%%%n", truckPercent);
        System.out.printf("%.2f%%%n", trainPercent);


    }
}
