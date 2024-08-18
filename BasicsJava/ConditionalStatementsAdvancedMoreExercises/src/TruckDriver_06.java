import java.util.Scanner;

public class TruckDriver_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kilometersPerMonth = Double.parseDouble(scanner.nextLine());

        double money = 0;

        if (kilometersPerMonth <= 5000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    money = (0.75 * kilometersPerMonth) * 4;
                    break;
                case "Summer":
                    money = (0.9 * kilometersPerMonth) * 4;
                    break;
                case "Winter":
                    money = (1.05 * kilometersPerMonth) * 4;
                    break;
            }
        } else if (kilometersPerMonth <= 10000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    money = (0.95 * kilometersPerMonth) * 4;
                    break;
                case "Summer":
                    money = (1.1 * kilometersPerMonth) * 4;
                    break;
                case "Winter":
                    money = (1.25 * kilometersPerMonth) * 4;
                    break;
            }
        } else {
            switch (season) {
                case "Spring":
                case "Autumn":
                case "Summer":
                case "Winter":
                    money = (1.45 * kilometersPerMonth) * 4;
                    break;
            }
        }

        money *= 0.9;

        System.out.printf("%.2f", money);
    }
}
