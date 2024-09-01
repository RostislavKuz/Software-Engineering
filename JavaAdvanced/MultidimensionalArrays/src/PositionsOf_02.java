import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rowsAndColumns = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(rowsAndColumns[0]);
        int cols = Integer.parseInt(rowsAndColumns[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] rawData = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(rawData[col]);
            }
        }

        boolean foundNumber = false;
        int numberToFind = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < cols; column++) {
                if (matrix[row][column] == numberToFind) {
                    foundNumber = true;

                    System.out.println(row + " " + column);
                }
            }
        }

        if (!foundNumber){
            System.out.println("not found");
        }
    }
}