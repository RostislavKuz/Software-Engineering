import java.util.Scanner;

public class LuckyNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int first = 1; first <= 9; first++) {
            for (int second = 1; second <= 9; second++) {
                for (int third = 1; third <= 9; third++) {
                    for (int fourth = 1; fourth <= 9; fourth++) {
                        if (number % (first + second) == 0 && (first + second) == (third + fourth)) {
                            System.out.printf("%d%d%d%d ", first, second, third, fourth);
                        }
                    }
                }
            }
        }
    }
}
