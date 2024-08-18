import java.util.Scanner;

public class AlcoholMarket_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double whiskeyPrice = Double.parseDouble(scanner.nextLine());
        double beer = Double.parseDouble(scanner.nextLine());
        double wine = Double.parseDouble(scanner.nextLine());
        double rakia = Double.parseDouble(scanner.nextLine());
        double whiskey = Double.parseDouble(scanner.nextLine());

        double rakiaPrice = whiskeyPrice * 0.5;
        double winePrice = rakiaPrice * 0.6;
        double beerPrice = rakiaPrice * 0.2;

        double needMoney = (whiskeyPrice * whiskey) + (beerPrice * beer) + (winePrice * wine) + (rakiaPrice * rakia);

        System.out.printf("%.2f", needMoney);


    }
}
