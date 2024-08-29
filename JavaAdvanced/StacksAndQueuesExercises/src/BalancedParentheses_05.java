import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        ArrayDeque<Character> openBracketsStack = new ArrayDeque<>();
        boolean isBalanced = false;

        for (int i = 0; i < input.length(); i++) {
            char currentBracket = input.charAt(i);
            if (currentBracket == '{' || currentBracket == '[' || currentBracket == '(') {
                openBracketsStack.push(currentBracket);
            } else if (currentBracket == '}' || currentBracket == ']' || currentBracket == ')') {

                if (openBracketsStack.isEmpty()) {
                    isBalanced = false;
                    break;
                } else {
                    char lastOpenBracket = openBracketsStack.peek();
                    if (currentBracket == '}' && lastOpenBracket == '{') {
                        openBracketsStack.pop();
                        isBalanced = true;
                    } else if (currentBracket == ']' && lastOpenBracket == '[') {
                        openBracketsStack.pop();
                        isBalanced = true;
                    } else if (currentBracket == ')' && lastOpenBracket == '(') {
                        openBracketsStack.pop();
                        isBalanced = true;
                    } else {
                        isBalanced = false;
                        break;
                    }
                }
            }
        }

        if (isBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
