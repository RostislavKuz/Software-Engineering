import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);

        getCharactersInRange(start, end);
    }

    private static void getCharactersInRange(char start, char end) {

        if (start < end) {
            for (int i = start + 1; i < end; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = end + 1; i < start; i++) {
                System.out.print((char) i + " ");
            }
        }

    }
}
