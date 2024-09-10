import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatrixRotation_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        String exception = "\\d+";
        Pattern pattern = Pattern.compile(exception);
        int degree = 0;
        Matcher matcher = pattern.matcher(command);

        if (matcher.find()) {
            degree = Integer.parseInt(matcher.group());
        }
        List<String> list = new ArrayList<>();
        int maxLength = 0;

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            list.add(input);
            if (maxLength < input.length()) {
                maxLength = input.length();
            }
            input = scanner.nextLine();
        }

        int rows = list.size();
        int cols = maxLength;
        String[][] matrix = new String[rows][cols];

        fillMatrix(matrix, list);

        //printMatrix(matrix);

        if (degree % 360 == 0 || degree == 0) {
            printMatrix(matrix);
        } else if (degree % 270 == 0) {
            String[][] rotatedMatrix = rotateMatrix270Degrees(matrix);
        } else if (degree % 180 == 0) {
            String[][] rotatedMatrix = rotateMatrix180Degrees(matrix);
        } else {
            String[][] rotatedMatrix = rotateMatrix90Degrees(matrix);
            printMatrix(rotatedMatrix);
        }
    }

    private static String[][] rotateMatrix90Degrees(String[][] matrix) {
        int rows = matrix[0].length;
        int cols = matrix.length;
        String[][] rotatedMatrix = new String[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {

                rotatedMatrix[col][matrix.length - 1 - row] = matrix[row][col];


            }
        }

        return rotatedMatrix;

    }

    private static String[][] rotateMatrix180Degrees(String[][] matrix) {
        return new String[0][];
    }

    private static String[][] rotateMatrix270Degrees(String[][] matrix) {
        int rows = matrix[0].length;
        int cols = matrix.length;
        String[][] rotatedMatrix = new String[cols][rows];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

            }
        }

        return rotatedMatrix;
    }


    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == null) {
                    matrix[row][col] = " ";
                }
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void fillMatrix(String[][] matrix, List<String> list) {
        for (int row = 0; row < matrix.length; row++) {
            String word = list.get(row);
            for (int i = 0; i < word.length(); i++) {
                matrix[row][i] = String.valueOf(word.charAt(i));
            }
        }
    }
}
