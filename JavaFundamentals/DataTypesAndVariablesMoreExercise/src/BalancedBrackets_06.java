import java.util.Scanner;

public class BalancedBrackets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean isOpen = false;
        boolean isClosed = false;
        boolean isBalanced = true;

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            if ((input.equals("(") && isOpen) || (input.equals(")") && isClosed)) {
                isBalanced = false;
            }

            if (input.equals("(")) {
                isOpen = true;
            } else if (input.equals(")")) {
                isClosed = true;
            }

            if (isClosed && !isOpen) {
                isBalanced = false;
            }

            if (isOpen && isClosed) {
                isOpen = false;
                isClosed = false;
            }


        }

        if (isBalanced && !isOpen) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
