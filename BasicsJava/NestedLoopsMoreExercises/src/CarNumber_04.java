import java.util.Scanner;

public class CarNumber_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        for (int i = first; i <= second; i++) {
            for (int j = first; j <= second; j++) {
                for (int k = first; k <= second; k++) {
                    for (int l = first; l <= second; l++) {

                        if ((i > l) && (j + k) % 2 == 0) {
                            if ((i % 2 == 0 && l % 2 != 0) || (i % 2 != 0 && l % 2 == 0)) {
                                System.out.printf("%d%d%d%d ", i, j, k, l);
                            }
                        }
                    }
                }
            }
        }
    }
}
