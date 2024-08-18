import java.util.Scanner;
import java.util.SortedMap;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double needMoney = Double.parseDouble(scanner.nextLine());
        double hasMoney = Double.parseDouble(scanner.nextLine());

        int countSpendDays = 0;
        int countAllDays = 0;

        while (needMoney > hasMoney) {
            if (countSpendDays == 5) {
                System.out.println("You can't save the money.");
                System.out.println(countAllDays);
                break;
            }
            countAllDays++;

            String action = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());

            switch (action) {
                case "save":
                    hasMoney += money;
                    countSpendDays = 0;
                    break;
                case "spend":
                    countSpendDays++;
                    hasMoney -= money;
                    if (hasMoney < 0) {
                        hasMoney = 0;
                    }
                    break;
            }
        }

        if (needMoney <= hasMoney) {
            System.out.printf("You saved the money for %d days.", countAllDays);
        }


    }
}
