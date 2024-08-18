import java.util.Scanner;

public class TheSongOfTheWheels_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int checksum = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        String password = "";
        boolean isFound = false;


        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {

                        if ((a < b && c > d) && ((a * b) + (c * d)) == checksum) {
                            counter++;

                            System.out.printf("%d%d%d%d ", a, b, c, d);

                            if (counter == 4) {
                                isFound = true;
                                password = password + a + b + c + d;
                            }
                        }
                    }
                }
            }
        }
        System.out.println();
        if (isFound) {
            System.out.printf("Password: %s", password);
        } else {
            System.out.println("No!");
        }
    }
}
