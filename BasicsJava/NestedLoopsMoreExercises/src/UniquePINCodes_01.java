import java.util.Scanner;

public class UniquePINCodes_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        for (int first = 1; first <= firstNumber; first++) {
            if (first % 2 == 0) {
                for (int second = 2; second <= secondNumber; second++) {
                    if (second == 2 || second == 3 || second == 5 || second == 7) {
                        for (int third = 1; third <= thirdNumber; third++) {
                            if (third % 2 == 0) {
                                System.out.printf("%d %d %d%n", first, second, third);
                            }


                        }

                    }

                }

            }
        }

    }
}

