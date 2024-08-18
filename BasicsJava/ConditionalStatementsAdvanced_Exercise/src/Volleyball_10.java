import java.util.Scanner;

public class Volleyball_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int holidays = Integer.parseInt(scanner.nextLine());
        int weekendsAtCountry = Integer.parseInt(scanner.nextLine());

        double gamesAtSofia = (48 - weekendsAtCountry) * ((3 * 1.0) / 4);
        double gamesAtCountry = weekendsAtCountry;
        double gamesAtHoliday = holidays * ((2 * 1.0) / 3);

        double totalGames = gamesAtSofia + gamesAtCountry + gamesAtHoliday;

        if (year.equals("leap")) {
            totalGames *= 1.15;
            System.out.printf("%.0f", Math.floor(totalGames));
        } else {
            System.out.printf("%.0f", Math.floor(totalGames));
        }

    }
}
