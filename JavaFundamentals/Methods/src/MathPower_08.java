import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        double result = mathPower(number, power);
        System.out.printf("%.0f", result);
    }

    private static double mathPower(double number, int power) {

        double result = 1;

        for (int i = 0; i < power; i++) {
            result = result * number;
        }
        return result;

    }
}
