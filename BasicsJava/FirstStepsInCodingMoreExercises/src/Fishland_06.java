import java.util.Scanner;

public class Fishland_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mackerelPrice = Double.parseDouble(scanner.nextLine());  // скумрия
        double spratFishPrice = Double.parseDouble(scanner.nextLine()); // цаца
        double bonitoFishKilo = Double.parseDouble(scanner.nextLine()); // паламуд
        double safridKilo = Double.parseDouble(scanner.nextLine()); // сафрид
        double musselsKilo = Double.parseDouble(scanner.nextLine()); //миди

        double bonitoFishPrice = mackerelPrice + mackerelPrice * 0.6;
        double safridPrice = spratFishPrice + spratFishPrice * 0.8;
        double musselsPrice = 7.50;

        double bonitoFishTotalPrice = bonitoFishPrice * bonitoFishKilo;
        double safridTotalPrice = safridPrice * safridKilo;
        double musselsTotalPrice = musselsPrice * musselsKilo;

        double totalPrice = bonitoFishTotalPrice + safridTotalPrice + musselsTotalPrice;

        System.out.printf("%.2f", totalPrice);


    }
}
