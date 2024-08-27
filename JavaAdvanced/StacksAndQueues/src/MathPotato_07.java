import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MathPotato_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] children = scanner.nextLine().split(" ");
        int numberOfTurns = Integer.parseInt(scanner.nextLine());
        PriorityQueue<String> childrenQueue = new PriorityQueue<>();

        for (int i = 0; i < children.length; i++) {
            childrenQueue.offer(children[i]);
        }

        int cycle = 1;
        while (childrenQueue.size() > 1) {
            for (int i = 1; i < numberOfTurns; i++) {
                /*String currentChild = childrenQueue.poll();
                childrenQueue.offer(currentChild);
                 */
                childrenQueue.offer(childrenQueue.poll());

            }

            if (isPrime(cycle)) {
                System.out.println("Prime " + childrenQueue.peek());
            } else {
                System.out.println("Removed " + childrenQueue.poll());
            }
            cycle++;
        }

        String lastChild = childrenQueue.poll();
        System.out.printf("Last is %s", lastChild);


    }

    private static boolean isPrime(int cycle) {
        boolean isPrime = true;
        for (int i = 2; i <= cycle - 1; i++) {
            if (cycle % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (cycle == 1) {
            return false;
        }
        return isPrime;
    }


}
