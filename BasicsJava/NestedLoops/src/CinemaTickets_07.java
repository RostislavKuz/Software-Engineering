import java.util.Scanner;

public class CinemaTickets_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();

        int ticketCount = 0;
        int studentCount = 0;
        int standardCount = 0;
        int kidCount = 0;

        int totalTickets = 0;

        while (!movieName.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());

            String ticketType = scanner.nextLine();

            while (!ticketType.equals("End")) {
                totalTickets++;
                ticketCount++;
                switch (ticketType) {
                    case "student":
                        studentCount++;
                        break;
                    case "standard":
                        standardCount++;
                        break;
                    case "kid":
                        kidCount++;
                        break;
                }

                if (ticketCount == freeSeats) {
                    break;
                }

                ticketType = scanner.nextLine();
            }

            System.out.printf("%s - %.2f%% full.%n", movieName, (ticketCount * 1.0 / freeSeats) * 100);
            ticketCount = 0;
            movieName = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", (studentCount * 1.0 / totalTickets) * 100);
        System.out.printf("%.2f%% standard tickets.%n", (standardCount * 1.0 / totalTickets) * 100);
        System.out.printf("%.2f%% kids tickets.%n", (kidCount * 1.0 / totalTickets) * 100);


    }
}

