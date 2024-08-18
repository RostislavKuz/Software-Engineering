import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long firstNumber = Integer.parseInt(scanner.nextLine());
        long secondNumber = Integer.parseInt(scanner.nextLine());

        double result = calculateFactorial(firstNumber)/ calculateFactorial(secondNumber);

        System.out.printf("%.2f", result);

    }

    private static double calculateFactorial(double number) {
        double factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
