import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int command = scanner.nextInt();

            switch (command){
                case 1:
                    int numberToPush = scanner.nextInt();
                    stack.push(numberToPush);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.println(Collections.max(stack));
                    break;
            }

        }

    }
}
