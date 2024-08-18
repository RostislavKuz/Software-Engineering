import java.util.Scanner;

public class BikeRace_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniorsCount = Integer.parseInt(scanner.nextLine());
        int seniorsCount = Integer.parseInt(scanner.nextLine());
        String trackType = scanner.nextLine();

        int totalCount = juniorsCount + seniorsCount;

        double juniorFee = 0;
        double seniorFee = 0;
        double totalFee = 0;

        switch (trackType) {
            case "trail":
                juniorFee = 5.5;
                seniorFee = 7;
                totalFee = juniorFee * juniorsCount + seniorFee * seniorsCount;
                break;
            case "cross-country":
                juniorFee = 8;
                seniorFee = 9.5;
                totalFee = juniorFee * juniorsCount + seniorFee * seniorsCount;
                if (totalCount >= 50) {
                    totalFee *= 0.75;
                }
                break;
            case "downhill":
                juniorFee = 12.25;
                seniorFee = 13.75;
                totalFee = juniorFee * juniorsCount + seniorFee * seniorsCount;
                break;
            case "road":
                juniorFee = 20;
                seniorFee = 21.50;
                totalFee = juniorFee * juniorsCount + seniorFee * seniorsCount;
                break;
        }

        totalFee *= 0.95;

        System.out.printf("%.2f", totalFee);
    }
}
