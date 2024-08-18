import java.util.Scanner;

public class WeddingSeats_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char sector = scanner.nextLine().charAt(0);
        int rows = Integer.parseInt(scanner.nextLine());
        int numberOfSeats = Integer.parseInt(scanner.nextLine());

        int seats = numberOfSeats;
        int counter = 0;

        for (char i = 'A'; i <= sector; i++) {
            for (int j = 1; j <= rows; j++) {
                if (j % 2 == 0) {
                    seats += 2;
                } else {
                    seats = numberOfSeats;
                }
                for (char k = 'a'; k < 'a' + seats; k++) {
                    counter++;
                    System.out.printf("%c%d%c%n", i, j, k);
                }
            }
            rows++;
        }
        System.out.println(counter);


    }
}
