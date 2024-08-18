import java.util.Scanner;

public class Harvest_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vineyard = Integer.parseInt(scanner.nextLine()); // лозе
        double grapesPerMeter = Double.parseDouble(scanner.nextLine()); // грозде за кв метър
        int littersOfWineNeeded = Integer.parseInt(scanner.nextLine()); // нужни литри вино
        int workers = Integer.parseInt(scanner.nextLine()); // брой работници


        double vineyardForWine = vineyard * 0.4;
        double totalWine = (grapesPerMeter * vineyardForWine) / 2.5;


        if (totalWine < littersOfWineNeeded) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(littersOfWineNeeded - totalWine));
        } else {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", totalWine);
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(totalWine - littersOfWineNeeded), Math.ceil((totalWine - littersOfWineNeeded) / workers));
        }


    }
}
