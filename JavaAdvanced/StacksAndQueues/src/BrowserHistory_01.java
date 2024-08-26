import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        String input = scanner.nextLine();

        while (!input.equals("Home")) {

            if (input.equals("back")) {
                if (browserHistory.size() <= 1) {
                    System.out.println("no previous URLs");
                } else {
                    browserHistory.pop();
                    System.out.println(browserHistory.peek());
                }
            } else {
                browserHistory.push(input);
                System.out.println(input);
            }
            input = scanner.nextLine();
        }


    }
}
