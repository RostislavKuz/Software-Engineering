import java.util.Scanner;

public class YardGreening_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double meters = Double.parseDouble(scanner.nextLine());

        double price = meters * 7.61;
        double priceWithDiscount = price * (1 - 0.18);
        double discount = price - priceWithDiscount;

        System.out.printf("The final price is: %.2f lv. %n", priceWithDiscount);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
