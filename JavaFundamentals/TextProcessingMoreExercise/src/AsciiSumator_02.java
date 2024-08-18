import java.util.Scanner;

public class AsciiSumator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstIndex = scanner.nextLine().charAt(0);
        int secondIndex = scanner.nextLine().charAt(0);
        String input = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            int element = input.charAt(i);

            if (element > firstIndex && element < secondIndex) {
                sum += element;
            }
        }
        System.out.println(sum);
    }
}
