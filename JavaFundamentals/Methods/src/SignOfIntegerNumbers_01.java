import java.util.Scanner;

public class SignOfIntegerNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        printSignOfIntegerNumber(number);

    }

    public static void printSignOfIntegerNumber(int number) {

        if (number == 0) {
            System.out.printf("The number %d is zero.", number);
        } else if (number < 0) {
            System.out.printf("The number %d is negative.", number);
        } else {
            System.out.printf("The number %d is positive.", number);
        }

    }
}
