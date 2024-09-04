import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2Submatrix_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstBigNumberRow = Integer.MIN_VALUE;
        int secondBigNumberRow = Integer.MIN_VALUE;
        int firstBigNumberCol = Integer.MIN_VALUE;
        int secondBigNumberCol = Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;

        int[] sizeOfMatrix = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int rows = sizeOfMatrix[0];
        int cols = sizeOfMatrix[1];
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            int[] numbers = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(e -> Integer.parseInt(e)).toArray();
            matrix[i] = numbers;
        }

        int sum = 0;
        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {

                int firstRow = matrix[row][col];
                int secondRow = matrix[row][col + 1];
                int firstCol = matrix[row + 1][col];
                int secondCol = matrix[row + 1][col + 1];

                sum = firstRow + secondRow + firstCol + secondCol;

                if (sum > maxSum) {
                    maxSum = sum;
                    firstBigNumberRow = firstRow;
                    secondBigNumberRow = secondRow;
                    firstBigNumberCol = firstCol;
                    secondBigNumberCol = secondCol;
                }
            }
        }

        System.out.println(firstBigNumberRow + " " + secondBigNumberRow);
        System.out.println(firstBigNumberCol + " " + secondBigNumberCol);
        System.out.println(maxSum);


    }
}
