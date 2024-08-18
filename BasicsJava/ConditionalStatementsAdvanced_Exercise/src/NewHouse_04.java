import java.util.Scanner;

public class NewHouse_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double flowerPrice = 0;

        switch (flowerType) {
            case "Roses":
                flowerPrice = 5;
                break;
            case "Dahlias":
                flowerPrice = 3.8;
                break;
            case "Tulips":
                flowerPrice = 2.8;
                break;
            case "Narcissus":
                flowerPrice = 3;
                break;
            case "Gladiolus":
                flowerPrice = 2.5;
                break;
        }

        double totalPrice = flowerCount * flowerPrice;

        if (flowerCount > 80 && flowerType.equals("Roses")) {
            totalPrice *= 0.9;
        } else if (flowerCount > 90 && flowerType.equals("Dahlias")) {
            totalPrice *= 0.85;
        } else if (flowerCount > 80 && flowerType.equals("Tulips")) {
            totalPrice *= 0.85;
        } else if (flowerCount < 120 && flowerType.equals("Narcissus")) {
            totalPrice *= 1.15;
        } else if (flowerCount < 80 && flowerType.equals("Gladiolus")) {
            totalPrice *= 1.20;
        }

        if (budget>=totalPrice){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, budget - totalPrice);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.", totalPrice - budget);
        }
    }
}
