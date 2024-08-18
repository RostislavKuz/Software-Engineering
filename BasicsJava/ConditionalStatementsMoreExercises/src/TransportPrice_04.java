import java.util.Scanner;

public class TransportPrice_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kilometers = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();

        double price = 0;

        if (kilometers >= 100) {
            price = kilometers * 0.06;
        } else if (kilometers >= 20) {
            price = kilometers * 0.09;
        } else {
            if (dayTime.equals("day")) {
                price = 0.70 + 0.79 * kilometers;
            } else {
                price = 0.70 + 0.90 * kilometers;
            }
        }

        System.out.printf("%.2f", price);
    }
}
