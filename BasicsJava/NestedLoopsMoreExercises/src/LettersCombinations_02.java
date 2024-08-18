import java.util.Scanner;

public class LettersCombinations_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        char third = scanner.nextLine().charAt(0);

        int counter = 0;

        for (char i = first; i <= second; i++) {
            for (char j = first; j <= second; j++) {
                for (char k = first; k <= second; k++) {

                    if (i != third && j != third && k != third) {
                        counter++;
                        System.out.printf("%c%c%c ", i, j, k);
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
