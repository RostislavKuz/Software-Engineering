import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            char symbol = line.charAt(i);
            result.append((char) (symbol + 3));
        }

        System.out.println(result);

    }
}
