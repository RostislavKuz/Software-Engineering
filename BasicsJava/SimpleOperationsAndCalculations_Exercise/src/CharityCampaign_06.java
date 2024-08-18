import java.util.Scanner;

public class CharityCampaign_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int backers = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        double cakesPrice = cakes * 45;
        double wafflesPrice = waffles * 5.80;
        double pancakesPrice = pancakes * 3.20;

        double moneyPerDay = backers * (cakesPrice + wafflesPrice + pancakesPrice);
        double moneyForAllDays = moneyPerDay * days;

        double money = moneyForAllDays - (moneyForAllDays * (1.0/8));

        System.out.printf("%.2f", money);

    }
}
