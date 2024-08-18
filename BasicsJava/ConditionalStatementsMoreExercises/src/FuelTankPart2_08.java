import java.util.Scanner;

public class FuelTankPart2_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double liters = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();

        double price = 0;

        switch (fuelType) {
            case "Gas":
                if (clubCard.equals("Yes")) {
                    price = (0.93 - 0.08) * liters;
                } else {
                    price = 0.93 * liters;
                }
                if (liters >= 20 && liters <= 25) {
                    price *= 0.92;
                } else if (liters > 25) {
                    price *= 0.90;
                }
                break;
            case "Gasoline":
                if (clubCard.equals("Yes")) {
                    price = (2.22 - 0.18) * liters;
                } else {
                    price = 2.22 * liters;
                }
                if (liters >= 20 && liters <= 25) {
                    price *= 0.92;
                } else if (liters > 25) {
                    price *= 0.90;
                }
                break;
            case "Diesel":
                if (clubCard.equals("Yes")) {
                    price = (2.33 - 0.12) * liters;
                } else {
                    price = 2.33 * liters;
                }
                if (liters >= 20 && liters <= 25) {
                    price *= 0.92;
                } else if (liters > 25) {
                    price *= 0.90;
                }
                break;
        }

        System.out.printf("%.2f lv.", price);


    }
}
