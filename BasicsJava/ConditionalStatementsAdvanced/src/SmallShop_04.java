import java.util.Scanner;

public class SmallShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());

        double price = 0;

        switch (product){
            case "coffee":
                if (city.equals("Sofia")){
                    price = amount * 0.50;
                } else if (city.equals("Plovdiv")) {
                    price = amount * 0.40;
                } else if (city.equals("Varna")) {
                    price = amount * 0.45;
                }
                break;
            case "water":
                if (city.equals("Sofia")){
                    price = amount * 0.80;
                } else if (city.equals("Plovdiv")) {
                    price = amount * 0.70;
                } else if (city.equals("Varna")) {
                    price = amount * 0.70;
                }
                break;
            case "beer":
                if (city.equals("Sofia")){
                    price = amount * 1.20;
                } else if (city.equals("Plovdiv")) {
                    price = amount * 1.15;
                } else if (city.equals("Varna")) {
                    price = amount * 1.10;
                }
                break;
            case "sweets":
                if (city.equals("Sofia")){
                    price = amount * 1.45;
                } else if (city.equals("Plovdiv")) {
                    price = amount * 1.30;
                } else if (city.equals("Varna")) {
                    price = amount * 1.35;
                }
                break;
            case "peanuts":
                if (city.equals("Sofia")){
                    price = amount * 1.60;
                } else if (city.equals("Plovdiv")) {
                    price = amount * 1.50;
                } else if (city.equals("Varna")) {
                    price = amount * 1.55;
                }
                break;
        }

        System.out.println(price);
    }
}
