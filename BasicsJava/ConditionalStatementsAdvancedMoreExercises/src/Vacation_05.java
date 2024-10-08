import java.util.Scanner;

public class Vacation_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        if (budget <= 1000) {
            switch (season) {
                case "Summer":
                    System.out.printf("Alaska - Camp - %.2f", budget * 0.65);
                    break;
                case "Winter":
                    System.out.printf("Morocco - Camp - %.2f", budget * 0.45);
                    break;
            }
        } else if (budget<=3000) {
            switch (season) {
                case "Summer":
                    System.out.printf("Alaska - Hut - %.2f", budget * 0.80);
                    break;
                case "Winter":
                    System.out.printf("Morocco - Hut - %.2f", budget * 0.60);
                    break;
            }
        }else {
            switch (season) {
                case "Summer":
                    System.out.printf("Alaska - Hotel - %.2f", budget * 0.9);
                    break;
                case "Winter":
                    System.out.printf("Morocco - Hotel - %.2f", budget * 0.9);
                    break;
            }
        }

    }
}
