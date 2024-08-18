import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String arrayAsString = scanner.nextLine();


        String[] numberAsStrings = arrayAsString.split(" ");

        int[] arr = new int[numberAsStrings.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(numberAsStrings[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }


        /*
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }


         */
    }
}