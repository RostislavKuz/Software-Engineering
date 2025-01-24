package stackOfStrings_04;

public class Main {
    public static void main(String[] args) {
        StackOfStrings stack = new StackOfStrings();

        stack.push("Antony");
        stack.push("Andrea");
        stack.push("Nick");

        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}
