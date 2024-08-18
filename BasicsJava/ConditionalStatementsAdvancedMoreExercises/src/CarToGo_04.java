import java.util.Scanner;

public class CarToGo_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        if (budget <= 100) {
            System.out.println("Economy class");
            if (season.equals("Summer")) {
                System.out.printf("Cabrio - %.2f ", budget * 0.35);
            } else {
                System.out.printf("Jeep - %.2f", budget * 0.65);
            }
        } else if (budget <= 500) {
            System.out.println("Compact class");
            if (season.equals("Summer")) {
                System.out.printf("Cabrio - %.2f ", budget * 0.45);
            } else {
                System.out.printf("Jeep - %.2f", budget * 0.80);
            }
        } else {
            System.out.println("Luxury class");
            if (season.equals("Summer")) {
                System.out.printf("Jeep - %.2f ", budget * 0.9);
            } else {
                System.out.printf("Jeep - %.2f", budget * 0.9);
            }
        }
    }
}
