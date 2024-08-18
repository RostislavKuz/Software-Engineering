import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int evenSum = 0;

        String arrayAsString = scanner.nextLine();

        String[] numbersAsString = arrayAsString.split(" ");

        int[] arr = new int[numbersAsString.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(numbersAsString[i]);
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                evenSum+=arr[i];
            }
        }

        System.out.println(evenSum);


    }
}
