import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstMatrixSize = scanner.nextLine().split("\\s+");
        int firstMatrixRows = Integer.parseInt(firstMatrixSize[0]);
        int firstMatrixCols = Integer.parseInt(firstMatrixSize[1]);
        int[][] firstMatrix = new int[firstMatrixRows][firstMatrixCols];

        for (int row = 0; row < firstMatrixRows; row++) {
            int[] rowData = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(e -> Integer.parseInt(e)).toArray();
            firstMatrix[row] = rowData;
        }

        String[] secondMatrixSize = scanner.nextLine().split("\\s+");
        int secondMatrixRows = Integer.parseInt(secondMatrixSize[0]);
        int secondMatrixCols = Integer.parseInt(secondMatrixSize[1]);
        int[][] secondMatrix = new int[secondMatrixRows][secondMatrixCols];

        if (firstMatrixRows != secondMatrixRows || firstMatrixCols != secondMatrixCols) {
            System.out.println("not equal");
            return;
        }

        for (int row = 0; row < secondMatrixRows; row++) {
            int[] rowData = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(e -> Integer.parseInt(e)).toArray();
            secondMatrix[row] = rowData;
        }

        boolean isEqual = true;
        for (int row = 0; row < firstMatrixRows; row++) {
            for (int cols = 0; cols < firstMatrixCols; cols++) {
                if (firstMatrix[row][cols] != secondMatrix[row][cols]) {
                    isEqual = false;
                }
            }
        }

        if (isEqual){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }


    }
}
