import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int x = scanner.nextInt();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            stack.push(scanner.nextInt());
        }

        for (int i = 0; i < s; i++) {
            stack.pop();
        }

        if (stack.contains(x)) {
            System.out.println("true");
        } else if (stack.isEmpty()) {
            System.out.println(0);
        } else {
            //System.out.println(Collections.min(stack));
            int smallestNumber = Integer.MAX_VALUE;
            while (!stack.isEmpty()) {
                int currentNumber = stack.pop();
                if (currentNumber < smallestNumber) {
                    smallestNumber = currentNumber;
                }
            }
            System.out.println(smallestNumber);
        }


    }
}
