import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(getSmallestNumber(getSmallestNumber(firstNumber, secondNumber), thirdNumber));
    }

    private static int getSmallestNumber(int firstNumber, int secondNumber) {

        if (firstNumber < secondNumber) {
            return firstNumber;
        }
        return secondNumber;
    }
}
