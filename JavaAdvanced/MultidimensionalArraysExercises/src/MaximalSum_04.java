import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] sizeOfMatrix = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(sizeOfMatrix[0]);
        int cols = Integer.parseInt(sizeOfMatrix[0]);
        int[][] matrix = new int[rows][cols];

        int maxSum = Integer.MIN_VALUE;
        int firstBigNumberRow1 = Integer.MIN_VALUE;
        int secondBigNumberRow1 = Integer.MIN_VALUE;
        int thirdBigNumberRow1 = Integer.MIN_VALUE;
        int firstBigNumberRow2 = Integer.MIN_VALUE;
        int secondBigNumberRow2 = Integer.MIN_VALUE;
        int thirdBigNumberRow2 = Integer.MIN_VALUE;
        int firstBigNumberRow3 = Integer.MIN_VALUE;
        int secondBigNumberRow3 = Integer.MIN_VALUE;
        int thirdBigNumberRow3 = Integer.MIN_VALUE;


        for (int i = 0; i < matrix.length; i++) {
            int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
            matrix[i] = array;
        }

        int sum = 0;
        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix[i].length - 2; j++) {
                int firstRow1 = matrix[i][j];
                int secondRow1 = matrix[i][j + 1];
                int thirdRow1 = matrix[i][j + 2];
                int firstRow2 = matrix[i + 1][j];
                int secondRow2 = matrix[i + 1][j + 1];
                int thirdRow2 = matrix[i + 1][j + 2];
                int firstRow3 = matrix[i + 2][j];
                int secondRow3 = matrix[i + 2][j + 1];
                int thirdRow3 = matrix[i + 2][j + 2];

                sum = firstRow1 + secondRow1 + thirdRow1 +
                        firstRow2 + secondRow2 + thirdRow2 +
                        firstRow3 + secondRow3 + thirdRow3;

                if (maxSum < sum) {
                    maxSum = sum;
                    firstBigNumberRow1 = firstRow1;
                    secondBigNumberRow1 = secondRow1;
                    thirdBigNumberRow1 = thirdRow1;
                    firstBigNumberRow2 = firstRow2;
                    secondBigNumberRow2 = secondRow2;
                    thirdBigNumberRow2 = thirdRow2;
                    firstBigNumberRow3 = firstRow3;
                    secondBigNumberRow3 = secondRow3;
                    thirdBigNumberRow3 = thirdRow3;
                }
            }
        }

        System.out.println("Sum = " + maxSum);
        System.out.println(firstBigNumberRow1 + " " + secondBigNumberRow1 + " " + thirdBigNumberRow1);
        System.out.println(firstBigNumberRow2 + " " + secondBigNumberRow2 + " " + thirdBigNumberRow2);
        System.out.println(firstBigNumberRow3 + " " + secondBigNumberRow3 + " " + thirdBigNumberRow3);


    }

    private static void printMatrix(int[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
