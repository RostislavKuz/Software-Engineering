import java.util.Scanner;

public class Sequence2kPlus1_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int counter = 1;

        while (counter <= number) {
            System.out.println(counter);
            counter = 2 * counter + 1;
        }
    }
}
