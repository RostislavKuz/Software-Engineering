import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        ArrayDeque<String> forwardHistory = new ArrayDeque<>();

        String input = scanner.nextLine();

        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (browserHistory.size() <= 1) {
                    System.out.println("no previous URLs");
                } else {
                    forwardHistory.addFirst(browserHistory.poll());
                    System.out.println(browserHistory.peek());
                }
            } else if (input.equals("forward")) {
                if (forwardHistory.isEmpty()) {
                    System.out.println("no next URLs");
                } else {
                    System.out.println(forwardHistory.peek());
                    browserHistory.addFirst(forwardHistory.poll());
                }
            } else {
                forwardHistory.clear();
                browserHistory.addFirst(input);
                System.out.println(browserHistory.peek());

            }


            input = scanner.nextLine();
        }


    }
}
