import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
            matrix[i] = array;
        }

        int primarySum = 0;
        int secondarySum = 0;

        for (int row = 0; row < matrix.length; row++) {
            primarySum += matrix[row][row];
        }

        for (int row = matrix.length - 1; row >= 0; row--) {
            secondarySum += matrix[row][matrix.length - 1 - row];
        }

        int diff = Math.abs(primarySum - secondarySum);
        System.out.println(diff);

    }
}
