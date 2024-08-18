import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        String[] firstArray = firstString.split(" ");

        String secondString = scanner.nextLine();
        String[] secondArray = secondString.split(" ");

        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < firstArray.length; j++) {
                if (firstArray[j].equals(secondArray[i])) {
                    System.out.printf("%s ", secondArray[i]);
                }
            }
        }


    }
}
