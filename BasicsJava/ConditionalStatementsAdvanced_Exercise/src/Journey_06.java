import java.util.Scanner;

public class Journey_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double moneySpend = 0;
        String destination = "";
        String vacationType = "";

        if (budget <= 100) {
            if (season.equals("summer")) {
                moneySpend = budget * 0.3;
                destination = "Bulgaria";
                vacationType = "Camp";
            } else {
                moneySpend = budget * 0.7;
                destination = "Bulgaria";
                vacationType = "Hotel";
            }
        } else if (budget <= 1000) {
            if (season.equals("summer")) {
                moneySpend = budget * 0.4;
                destination = "Balkans";
                vacationType = "Camp";
            } else {
                moneySpend = budget * 0.8;
                destination = "Balkans";
                vacationType = "Hotel";
            }
        } else {
            moneySpend = budget * 0.9;
            destination = "Europe";
            vacationType = "Hotel";

        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", vacationType, moneySpend);

    }
}
