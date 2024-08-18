import java.util.Scanner;

public class MinNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int min = Integer.MAX_VALUE;

        while (counter < n) {
            int number = Integer.parseInt(scanner.nextLine());
            counter++;

            if (number < min) {
                min = number;
            }
        }
        System.out.println(min);
    }
}
