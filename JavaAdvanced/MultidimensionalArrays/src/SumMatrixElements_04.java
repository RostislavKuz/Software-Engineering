import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] sizeOfMatrix = scanner.nextLine().split(", ");
        int rowsCount = Integer.parseInt(sizeOfMatrix[0]);
        int columnsCount = Integer.parseInt(sizeOfMatrix[1]);
        int sum = 0;

        int[][] matrix = new int[rowsCount][columnsCount];

        for (int i = 0; i < rowsCount; i++) {
            int[] array = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(e -> Integer.parseInt(e)).toArray();
            matrix[i] = array;
        }


        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                sum += matrix[row][column];
            }
        }

        System.out.println(rowsCount);
        System.out.println(columnsCount);
        System.out.println(sum);


    }
}
