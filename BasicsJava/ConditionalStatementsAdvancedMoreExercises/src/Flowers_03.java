import java.util.Scanner;

public class Flowers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemumsCount = Integer.parseInt(scanner.nextLine());
        int rosesCount = Integer.parseInt(scanner.nextLine());
        int tulipsCount = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String isHoliday = scanner.nextLine();

        int totalCount = chrysanthemumsCount + rosesCount + tulipsCount;

        double price = 0;

        switch (season) {
            case "Spring":
            case "Summer":
                price = chrysanthemumsCount * 2 + rosesCount * 4.10 + tulipsCount * 2.50;
                if (isHoliday.equals("Y")) {
                    price *= 1.15;
                }
                if (tulipsCount >= 7 && season.equals("Spring")) {
                    price *= 0.95;
                }
                if (totalCount > 20) {
                    price *= 0.8;
                }

                break;
            case "Autumn":
            case "Winter":
                price = chrysanthemumsCount * 3.75 + rosesCount * 4.50 + tulipsCount * 4.15;
                if (isHoliday.equals("Y")) {
                    price *= 1.15;
                }
                if (rosesCount >= 10 && season.equals("Winter")) {
                    price *= 0.90;
                }
                if (totalCount > 20) {
                    price *= 0.8;
                }

                break;
        }
        price += 2;

        System.out.printf("%.2f", price);

    }
}
