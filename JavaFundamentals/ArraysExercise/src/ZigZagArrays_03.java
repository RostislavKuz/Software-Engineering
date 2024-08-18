import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        boolean isEven = false;

        for (int i = 0; i < n; i++) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();

            if (isEven) {
                firstArray[i] = first;
                secondArray[i] = second;

                isEven = false;
            } else {
                firstArray[i] = second;
                secondArray[i] = first;

                isEven = true;
            }
        }
        for (int i = 0; i < secondArray.length; i++) {
            System.out.printf("%d ", secondArray[i]);
        }

        System.out.println();

        for (int i = 0; i < firstArray.length; i++) {
            System.out.printf("%d ", firstArray[i]);
        }


    }
}
