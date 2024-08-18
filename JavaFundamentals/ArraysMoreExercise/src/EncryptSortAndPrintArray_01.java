import java.util.Scanner;

public class EncryptSortAndPrintArray_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int sum = 0;

            for (int j = 0; j < input.length(); j++) {
                char letter = input.charAt(j);

                if (letter == 65 || letter == 69 || letter == 73 || letter == 79 || letter == 85 ||
                        letter == 97 || letter == 101 || letter == 105 || letter == 111 || letter == 117) {
                    sum += letter * input.length();
                } else {
                    sum += letter / input.length();
                }
            }
            array[i] = sum;
        }
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d%n", array[i]);
        }
    }
}
