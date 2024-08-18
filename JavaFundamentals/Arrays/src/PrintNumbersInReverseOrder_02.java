import java.util.Scanner;

public class PrintNumbersInReverseOrder_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        /*
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.printf("%d ", numbers[i]);
        }
         */


        // 1 2 3 4 5

        int reserv = 0;
        for (int i = 0; i < numbers.length / 2; i++) {
            reserv = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = reserv;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d ", numbers[i]);
        }


    }
}
