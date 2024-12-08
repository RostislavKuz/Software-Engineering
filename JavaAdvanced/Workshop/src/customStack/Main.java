package customStack;

public class Main {
    public static void main(String[] args) {
        CustomStack customStack = new CustomStack();

        // push
        for (int i = 0; i < 6; i++) {
            customStack.push(i);
        }

        // pop
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());

        // peek
        System.out.println(customStack.peek());

    }
}
