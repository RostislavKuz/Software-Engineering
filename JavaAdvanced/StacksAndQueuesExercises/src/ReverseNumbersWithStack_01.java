import java.util.*;

public class ReverseNumbersWithStack_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();
        String[] numbers = scanner.nextLine().split("\\s+");

        for (String number : numbers) {
            stack.push(number);
        }

        int stackSize = stack.size();
        for (int i = 0; i < stackSize; i++) {
            System.out.print(stack.pop() + " ");
        }


    }
}
