import java.util.Scanner;

public class CleverLily_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washerPrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());


        int totalToysPrice = 0;
        int totalMoney = 0;

        int getsMoney = 0;
        int money = 10;


        for (int i = 0; i < age; i++) {

            if (i % 2 == 0) {
                totalToysPrice += toyPrice;
            } else {
                getsMoney += money;
                money += 10;
                getsMoney -= 1;
            }
        }

        totalMoney = totalToysPrice + getsMoney;

        if (totalMoney >= washerPrice) {
            System.out.printf("Yes! %.2f", totalMoney - washerPrice);
        }else {
            System.out.printf("No! %.2f", washerPrice - totalMoney);
        }


    }
}
