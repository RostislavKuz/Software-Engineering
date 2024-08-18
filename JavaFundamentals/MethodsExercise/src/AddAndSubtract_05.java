import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(addAndSubtract(firstNumber, secondNumber, thirdNumber));
    }

    private static int addAndSubtract(int firstNumber, int secondNumber, int thirdNumber) {

        int sum = getSum(firstNumber, secondNumber);
        int subtract = getSubtract(sum, thirdNumber);

        return subtract;
    }

    private static int getSubtract(int sum, int thirdNumber) {
        return sum - thirdNumber;
    }

    private static int getSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
