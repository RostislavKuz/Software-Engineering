import java.util.Scanner;

public class GodzillaVsKong_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countStatists = Integer.parseInt(scanner.nextLine());
        double pricePerStatist = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;

        double clothesPrice = countStatists * pricePerStatist;

        if (countStatists > 150) {
            clothesPrice *= 0.9;
        }

        double needMoney = decor + clothesPrice;

        if (budget<needMoney){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", needMoney - budget);
        }else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - needMoney);
        }
    }
}
