import java.util.Scanner;

public class ThroneConquering_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //2:20

        int energy = Integer.parseInt(scanner.nextLine());
        int rows = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[rows][rows];

        for (int row = 0; row < rows; row++) {
            char[] line = scanner.nextLine().toCharArray();
            field[row] = line;
        }

        int parisRow = 0;
        int parisCol = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < field[row].length; col++) {
                if (field[row][col] == 'P') {
                    parisRow = row;
                    parisCol = col;
                }
            }
        }

        while (true) {
            String[] command = scanner.nextLine().split("\\s+");
            String direction = command[0];
            int enemyRow = Integer.parseInt(command[1]);
            int enemyCol = Integer.parseInt(command[2]);

            field[parisRow][parisCol] = '-';
            field[enemyRow][enemyCol] = 'S';
            switch (direction) {
                case "up":
                    if (parisRow - 1 >= 0) {
                        parisRow--;
                    }
                    break;
                case "down":
                    if (parisRow + 1 < field.length) {
                        parisRow++;
                    }
                    break;
                case "left":
                    if (parisCol - 1 >= 0) {
                        parisCol--;
                    }
                    break;
                case "right":
                    if (parisCol + 1 < field[parisRow].length) {
                        parisCol++;
                    }
                    break;
            }

            energy--;
            if (energy <= 0) {
                parisDead(field, parisRow, parisCol);
                break;
            }

            if (field[parisRow][parisCol] == 'S') {
                energy -= 2;
                if (energy <= 0) {
                    parisDead(field, parisRow, parisCol);
                    break;
                } else {
                    field[parisRow][parisCol] = '-';
                }
            } else if (field[parisRow][parisCol] == 'H') {
                field[parisRow][parisCol] = '-';
                System.out.printf("Paris has successfully abducted Helen! Energy left: %d%n", energy);
                printField(field);
                break;
            }


        }

    }

    public static void parisDead(char[][] field, int parisRow, int parisCol) {
        field[parisRow][parisCol] = 'X';
        System.out.printf("Paris died at %d;%d.%n", parisRow, parisCol);
        printField(field);
    }

    private static void printField(char[][] field) {
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                System.out.print(field[row][col]);
            }
            System.out.println();
        }
    }


}
