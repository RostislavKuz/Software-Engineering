import java.util.Scanner;

public class NumberPyramid_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int counter = 1;
        boolean isBigger = false;

        for (int rows = 1; rows <= n; rows++) {
            for (int columns = 1; columns <= rows; columns++) {
                System.out.print(counter + " ");

                counter++;

                if (counter > n) {
                    isBigger = true;
                    break;
                }
            }
            System.out.println();

            if (isBigger) {
                break;
            }

        }
    }
}
