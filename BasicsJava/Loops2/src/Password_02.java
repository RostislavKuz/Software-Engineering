import java.util.Scanner;

public class Password_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String correctPassword = scanner.nextLine();

        String password = scanner.nextLine();

        while (!correctPassword.equals(password)) {
            password = scanner.nextLine();
        }
        System.out.printf("Welcome %s!", username);
    }
}
