import java.util.Scanner;

public class GamingStore_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        double price = 0;
        double sum = 0;

        while (true) {
            String game = scanner.nextLine();

            if (game.equals("Game Time")) {
                break;
            }


            switch (game) {
                case "OutFall 4":
                    price = 39.99;
                    if (money - price >= 0) {
                        money -= price;
                        sum += price;
                        System.out.println("Bought OutFall 4");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "CS: OG":
                    price = 15.99;
                    if (money - price >= 0) {
                        money -= price;
                        sum += price;
                        System.out.println("Bought CS: OG");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    if (money - price >= 0) {
                        money -= price;
                        sum += price;
                        System.out.println("Bought Zplinter Zell");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Honored 2":
                    price = 59.99;
                    if (money - price >= 0) {
                        money -= price;
                        sum += price;
                        System.out.println("Bought Honored 2");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch":
                    price = 29.99;
                    if (money - price >= 0) {
                        money -= price;
                        sum += price;
                        System.out.println("Bought RoverWatch");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    if (money - price >= 0) {
                        money -= price;
                        sum += price;
                        System.out.println("Bought RoverWatch Origins Edition");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }



        }
        if (money <= 0) {
            System.out.println("Out of money!");
        } else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f%n", sum, money);
        }
    }
}
