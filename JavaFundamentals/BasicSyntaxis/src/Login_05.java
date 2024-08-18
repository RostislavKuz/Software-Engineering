import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";
        int counter = 0;

        for (int i = username.length(); i > 0; i--) {
            password = password + username.charAt(i - 1);
        }

        while (true) {
            String input = scanner.nextLine();
            counter++;


            if (input.equals(password)) {
                System.out.printf("User %s logged in.", username);
                break;
            } else {
                if (counter == 4) {
                    System.out.printf("User %s blocked!", username);
                    break;
                }
                System.out.println("Incorrect password. Try again.");
            }


        }


    }
}
