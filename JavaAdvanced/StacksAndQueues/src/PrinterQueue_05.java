import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();

        String input = scanner.nextLine();

        while (!input.equals("print")) {

            if (!input.equals("cancel")) {
                queue.offer(input);
            } else {
                if (queue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + queue.poll());
                }
            }

            input = scanner.nextLine();
        }

        for (String s : queue) {
            System.out.println(s);
        }


    }
}
