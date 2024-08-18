import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalMoney = 0;


        String input = scanner.nextLine();

        while (!input.equals("Start")) {
            double inputMoney = Double.parseDouble(input);

            if (inputMoney == 0.1 || inputMoney == 0.2 || inputMoney == 0.5 || inputMoney == 1 || inputMoney == 2) {
                totalMoney += inputMoney;
            } else {
                System.out.printf("Cannot accept %.2f%n", inputMoney);
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("End")) {
            switch (input) {
                case "Nuts":
                    if (totalMoney >= 2) {
                        totalMoney -= 2;
                        System.out.println("Purchased Nuts");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (totalMoney >= 0.7) {
                        totalMoney -= 0.7;
                        System.out.println("Purchased Water");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (totalMoney >= 1.5) {
                        totalMoney -= 1.5;
                        System.out.println("Purchased Crisps");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (totalMoney >= 0.8) {
                        totalMoney -= 0.8;
                        System.out.println("Purchased Soda");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (totalMoney >= 1) {
                        totalMoney -= 1;
                        System.out.println("Purchased Coke");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", totalMoney);
    }
}
