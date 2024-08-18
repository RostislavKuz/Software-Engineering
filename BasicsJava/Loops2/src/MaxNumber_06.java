import java.util.Scanner;

public class MaxNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int max = Integer.MIN_VALUE;

        while (n > counter) {
            int number = Integer.parseInt(scanner.nextLine());
            counter++;

            if (number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }
}
