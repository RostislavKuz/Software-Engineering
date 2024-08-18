import java.util.Scanner;

public class SkiTrip_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysInBansko = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String mark = scanner.nextLine();

        int nights = daysInBansko - 1;
        double priceOfVacation = 0;

        switch (roomType) {
            case "room for one person":
                priceOfVacation = nights * 18;
                break;
            case "apartment":
                priceOfVacation = nights * 25;
                if (nights < 10) {
                    priceOfVacation *= 0.7;
                } else if (nights <= 15) {
                    priceOfVacation *= 0.65;
                } else if (nights > 15) {
                    priceOfVacation *= 0.50;
                }
                break;
            case "president apartment":
                priceOfVacation = nights * 35;
                if (nights < 10) {
                    priceOfVacation *= 0.9;
                } else if (nights <= 15) {
                    priceOfVacation *= 0.85;
                } else if (nights > 15) {
                    priceOfVacation *= 0.80;
                }
                break;

        }

        if (mark.equals("positive")) {
            priceOfVacation *= 1.25;
        } else {
            priceOfVacation *= 0.90;
        }

        System.out.printf("%.2f", priceOfVacation);


    }
}
