import java.util.Arrays;
import java.util.Scanner;

public class Python_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] commands = scanner.nextLine().split(",\\s+");

        char[][] matrix = new char[n][n];

        for (int row = 0; row < n; row++) {
            matrix[row] = scanner.nextLine().replace(" ", "").toCharArray();
        }

        int rowPython = 0;
        int colPython = 0;

        int countFood = 0;
        int foodEaten = 0;


        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                char currentElement = matrix[row][col];
                if (currentElement == 's') {
                    rowPython = row;
                    colPython = col;
                } else if (currentElement == 'f') {
                    countFood++;
                }
            }
        }

        int length = 1;
        boolean isDead = false;

        for (String command : commands) {
            matrix[rowPython][colPython] = '*';
            switch (command) {
                case "left":
                    colPython--;
                    break;
                case "right":
                    colPython++;
                    break;
                case "up":
                    rowPython--;
                    break;
                case "down":
                    rowPython++;
                    break;
            }

            if (rowPython < 0) {
                rowPython = matrix.length - 1;
            }
            if (rowPython >= matrix.length) {
                rowPython = 0;
            }
            if (colPython < 0) {
                colPython = matrix.length - 1;
            }
            if (colPython >= matrix.length) {
                colPython = 0;
            }

            if (matrix[rowPython][colPython] == 'f') {
                length++;
                foodEaten++;
            }

            if (foodEaten == countFood) {
                System.out.printf("You win! Final python length is %d%n", length);
                break;
            }

            if (matrix[rowPython][colPython] == 'e') {
                System.out.println("You lose! Killed by an enemy!");
                isDead = true;
                break;
            }
            matrix[rowPython][colPython] = 's';
        }

        if (foodEaten < countFood && !isDead) {
            System.out.printf("You lose! There is still %d food to be eaten.", countFood - foodEaten);
        }

    }
}
