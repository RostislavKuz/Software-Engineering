import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "add":
                add(first, second);
                break;
            case "multiply":
                multiply(first, second);
                break;
            case "subtract":
                subtract(first, second);
                break;
            case "divide":
                divide(first, second);
                break;
        }
    }

    private static void add(int first, int second) {
        System.out.println(first + second);
    }

    private static void multiply(int first, int second) {
        System.out.println(first * second);
    }

    private static void subtract(int first, int second) {
        System.out.println(first - second);
    }

    private static void divide(int first, int second) {
        System.out.println(first / second);
    }
}
