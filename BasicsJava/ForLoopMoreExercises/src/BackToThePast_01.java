import java.util.Scanner;

public class BackToThePast_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());

        double needMoney = 0;

        int age = 18;

        for (int i = 1800; i <= year; i++) {
            if (i % 2 == 0) {
                needMoney += 12000;
            } else {
                needMoney = needMoney + 12000 + (50 * age);
            }
            age++;
        }

        if (money >= needMoney) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", money - needMoney);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", needMoney - money);
        }
    }
}
