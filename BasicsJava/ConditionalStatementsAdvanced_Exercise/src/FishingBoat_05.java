import java.util.Scanner;

public class FishingBoat_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermenCount = Integer.parseInt(scanner.nextLine());

        double boatRent = 0;

        switch (season) {
            case "Spring":
                boatRent = 3000;
                break;
            case "Summer":
                boatRent = 4200;
                break;
            case "Autumn":
                boatRent = 4200;
                break;
            case "Winter":
                boatRent = 2600;
                break;
        }

        if (fishermenCount <= 6) {
            boatRent *= 0.9;
        } else if (fishermenCount <= 11) {
            boatRent *= 0.85;
        } else {
            boatRent *= 0.75;
        }

        if (fishermenCount % 2 == 0 && !season.equals("Autumn")) {
            boatRent *= 0.95;
        }


        if (budget >= boatRent) {
            System.out.printf("Yes! You have %.2f leva left.", budget - boatRent);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", boatRent - budget);
        }
    }
}
