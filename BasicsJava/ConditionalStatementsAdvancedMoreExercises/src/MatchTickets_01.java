import java.util.Scanner;

public class MatchTickets_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        String ticketType = scanner.nextLine();
        int peopleCount = Integer.parseInt(scanner.nextLine());


        double forTransport = 0;

        if (peopleCount <= 4) {
            forTransport = budget * 0.75;
        } else if (peopleCount <= 9) {
            forTransport = budget * 0.6;
        } else if (peopleCount <= 24) {
            forTransport = budget * 0.5;
        } else if (peopleCount <= 49) {
            forTransport = budget * 0.4;
        } else {
            forTransport = budget * 0.25;
        }

        double moneyAfterTransport = budget - forTransport;

        double ticketPrice = 0;

        switch (ticketType) {
            case "VIP":
                ticketPrice = 499.99 * peopleCount;
                break;
            case "Normal":
                ticketPrice = 249.99 * peopleCount;
                break;
        }

        if (moneyAfterTransport > ticketPrice) {
            System.out.printf("Yes! You have %.2f leva left.", moneyAfterTransport - ticketPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", ticketPrice - moneyAfterTransport);
        }
    }
}
