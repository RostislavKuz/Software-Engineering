import java.util.Scanner;

public class ToyShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double puzzlesPrice = 2.60;
        double talkingDollPrice = 3;
        double teddyBearPrice = 4.10;
        double minionPrice = 8.20;
        double truckPrice = 2;

        double needMoney = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int talkingDolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        int orderedToys = puzzles + talkingDolls + teddyBears + minions + trucks;
        double priceForAllToys = (puzzles * puzzlesPrice) + (talkingDolls * talkingDollPrice) + (teddyBears * teddyBearPrice) + (minions * minionPrice) + (trucks * truckPrice);

        if (orderedToys >= 50) {
            priceForAllToys *= 0.75;
        }

        priceForAllToys *= 0.90;

        if (needMoney <= priceForAllToys) {
            System.out.printf("Yes! %.2f lv left.", priceForAllToys - needMoney);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.", needMoney - priceForAllToys);
        }

    }
}
