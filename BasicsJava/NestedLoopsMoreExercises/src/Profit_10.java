import java.util.Scanner;

public class Profit_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oneLv = Integer.parseInt(scanner.nextLine());
        int twoLv = Integer.parseInt(scanner.nextLine());
        int fiveLv = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= oneLv; i++) {
            for (int j = 0; j <= twoLv; j++) {
                for (int k = 0; k <= fiveLv; k++) {

                    if ((i * 1 + j * 2 + k * 5) == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j, k, sum);
                    }
                }
            }
        }
    }
}
