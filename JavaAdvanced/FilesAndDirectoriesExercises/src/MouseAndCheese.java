import java.util.Scanner;

public class MouseAndCheese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[n][n];
        int mouseRow = 0;
        int mouseCol = 0;
        int countCheese = 0;

        fillMatrix(scanner, n, matrix);

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                char currentSymbol = matrix[row][col];
                if (currentSymbol == 'M') {
                    mouseRow = row;
                    mouseCol = col;
                }
            }
        }

        countCheese = moveMouse(scanner, n, matrix, mouseRow, mouseCol, countCheese);

        if (countCheese >= 5) {
            System.out.printf("Great job, the mouse is fed %d cheeses!%n", countCheese);
        } else {
            System.out.printf("The mouse couldn't eat the cheeses, she needed %d cheeses more.%n", 5 - countCheese);
        }
        printMatrix(n, matrix);
    }

    private static int moveMouse(Scanner scanner, int n, char[][] matrix, int mouseRow, int mouseCol, int countCheese) {
        String direction = scanner.nextLine();
        while (!direction.equals("end")) {

            matrix[mouseRow][mouseCol] = '-';

            switch (direction) {
                case "up":
                    mouseRow--;
                    break;
                case "down":
                    mouseRow++;
                    break;
                case "left":
                    mouseCol--;
                    break;
                case "right":
                    mouseCol++;
                    break;
            }

            if (mouseRow >= n || mouseRow < 0 || mouseCol < 0 || mouseCol >= n) {
                System.out.println("Where is the mouse?");
                break;
            }

            if (matrix[mouseRow][mouseCol] == 'c') {
                countCheese++;
            } else if (matrix[mouseRow][mouseCol] == 'B') {
                continue;
            }


            matrix[mouseRow][mouseCol] = 'M';


            direction = scanner.nextLine();
        }
        return countCheese;
    }

    private static void printMatrix(int n, char[][] matrix) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void fillMatrix(Scanner scanner, int n, char[][] matrix) {
        for (int i = 0; i < n; i++) {
            String rowContent = scanner.nextLine();
            char[] rowSymbols = rowContent.toCharArray();
            matrix[i] = rowSymbols;
        }
    }
}
