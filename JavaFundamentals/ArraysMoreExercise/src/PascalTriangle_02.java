import java.util.Arrays;
import java.util.Scanner;

public class PascalTriangle_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        // 1
        // 1 1
        // 1 2 1
        // 1 3 3 1
        // 1 4 6 4 1

        int[] finalArray = new int[1];
        int[] middleNumbers = new int[1];
        int[] reserve = new int[1];
        int sum = 0;
        int res = 0;

        for (int i = 1; i <= n; i++) {
            finalArray = new int[i];
            Arrays.fill(finalArray, 1);

            for (int j = 0; j < finalArray.length; j++) {
                res = reserve[j];
                finalArray[j] = res;
            }
            if (finalArray.length <= 2) {
                for (int j = 0; j < finalArray.length; j++) {
                    System.out.printf("%d ", 1);
                }
                middleNumbers = new int[finalArray.length - 1];

                for (int j = 0; j < middleNumbers.length; j++) {
                    sum = finalArray[j] + finalArray[j + 1];
                    middleNumbers[j] = sum;
                }
                reserve = new int[finalArray.length + 1];
                reserve[0] = 1;
                reserve[reserve.length - 1] = 1;
                for (int j = 0; j < middleNumbers.length; j++) {
                    res = middleNumbers[0];
                    reserve[j + 1] = res;
                }
            } else {
                for (int j = 0; j < finalArray.length; j++) {
                    System.out.printf("%d ", finalArray[j]);
                }
                middleNumbers = new int[finalArray.length - 1];

                for (int j = 0; j < middleNumbers.length; j++) {
                    sum = finalArray[j] + finalArray[j + 1];
                    middleNumbers[j] = sum;
                }
                reserve = new int[finalArray.length + 1];
                reserve[0] = 1;
                reserve[reserve.length - 1] = 1;
                for (int j = 0; j < middleNumbers.length; j++) {
                    res = middleNumbers[j];
                    reserve[j + 1] = res;
                }
            }
            System.out.println();
        }
    }
}
