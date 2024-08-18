import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] arrayOfPeople = new int[n];
        int sum = 0;

        for (int i = 0; i < arrayOfPeople.length; i++) {
            int countOfPeople = Integer.parseInt(scanner.nextLine());
            arrayOfPeople[i] = countOfPeople;
            sum += countOfPeople;
        }

        for (int i = 0; i < arrayOfPeople.length; i++) {
            System.out.printf("%d ", arrayOfPeople[i]);
        }

        System.out.println();
        System.out.println(sum);

    }
}
