import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        getMiddleCharacters(input);
    }

    private static void getMiddleCharacters(String input) {

        if (input.length() % 2 == 0) {
            System.out.println(input.charAt(input.length() / 2 - 1) + "" + input.charAt(input.length() / 2));
        } else {
            System.out.println(input.charAt(input.length() / 2));
        }
    }
}
