import java.util.Scanner;

public class DecryptingMessage_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        String result = "";

        for (int i = 0; i < n; i++) {
            char input = scanner.nextLine().charAt(0);
            result = result + (char) (input + key);
        }

        System.out.println(result);
    }
}
