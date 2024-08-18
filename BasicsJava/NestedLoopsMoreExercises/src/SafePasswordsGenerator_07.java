import java.util.Scanner;

public class SafePasswordsGenerator_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int max = Integer.parseInt(scanner.nextLine());

        boolean isMax = false;
        int counter = 0;


        for (char i = 35; i <= 55; i++) {
            for (char j = 64; j <= 96; j++) {
                for (int k = 1; k <= a; k++) {
                    for (int l = 1; l <= b; l++) {
                        if (counter >= max) {
                            isMax = true;
                            break;
                        }


                        System.out.printf("%c%c%d%d%c%c|", i, j, k, l, j, i);

                        if (k == a && l == b) {
                            isMax = true;
                            break;
                        }
                        i++;
                        if (i > 55) {
                            i = 35;
                        }
                        j++;
                        if (j > 96) {
                            j = 64;
                        }


                        counter++;
                    }

                    if (isMax) {
                        break;
                    }
                }
                if (isMax) {
                    break;
                }
            }
            if (isMax) {
                break;
            }
        }
    }
}
