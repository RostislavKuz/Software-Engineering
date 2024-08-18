import java.util.Scanner;

public class FruitShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());

        double price = 0;

        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if (fruit.equals("banana")) {
                    price = amount * 2.50;
                    System.out.printf("%.2f",price);
                } else if (fruit.equals("apple")) {
                    price = amount * 1.20;
                    System.out.printf("%.2f",price);
                } else if (fruit.equals("orange")) {
                    price = amount * 0.85;
                    System.out.printf("%.2f",price);
                } else if (fruit.equals("grapefruit")) {
                    price = amount * 1.45;
                    System.out.printf("%.2f",price);
                } else if (fruit.equals("kiwi")) {
                    price = amount * 2.70;
                    System.out.printf("%.2f",price);
                } else if (fruit.equals("pineapple")) {
                    price = amount * 5.50;
                    System.out.printf("%.2f",price);
                } else if (fruit.equals("grapes")) {
                    price = amount * 3.85;
                    System.out.printf("%.2f",price);
                }else {
                    System.out.println("error");
                }
                break;
            case "Saturday":
            case "Sunday":
                if (fruit.equals("banana")) {
                    price = amount * 2.70;
                    System.out.printf("%.2f",price);
                } else if (fruit.equals("apple")) {
                    price = amount * 1.25;
                    System.out.printf("%.2f",price);
                } else if (fruit.equals("orange")) {
                    price = amount * 0.90;
                    System.out.printf("%.2f",price);
                } else if (fruit.equals("grapefruit")) {
                    price = amount * 1.60;
                    System.out.printf("%.2f",price);
                } else if (fruit.equals("kiwi")) {
                    price = amount * 3.00;
                    System.out.printf("%.2f",price);
                } else if (fruit.equals("pineapple")) {
                    price = amount * 5.60;
                    System.out.printf("%.2f",price);
                } else if (fruit.equals("grapes")) {
                    price = amount * 4.20;
                    System.out.printf("%.2f",price);
                }else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                break;

        }
    }
}
