import java.util.Scanner;

public class TriplesOfLatinLetters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (char i = 'a'; i <= 'a' + n - 1; i++) {
            for (char j = 'a'; j <= 'a' + n - 1; j++) {
                for (char k = 'a'; k <= 'a' + n - 1; k++) {
                    System.out.printf("%c%c%c%n", i, j, k);
                }
            }

        }
    }
}
