import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayOfNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            boolean isTop = true;
            for (int j = i + 1; j < arrayOfNumbers.length; j++) {

                if (arrayOfNumbers[i] <= arrayOfNumbers[j]) {
                    isTop = false;
                }
            }
            if (isTop) {
                System.out.printf("%d ", arrayOfNumbers[i]);
            }
        }

    }
}
