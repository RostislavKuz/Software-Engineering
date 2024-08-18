import java.util.Scanner;

public class ChallengeTheWedding_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maleCount = Integer.parseInt(scanner.nextLine());
        int femaleCount = Integer.parseInt(scanner.nextLine());
        int tablesCount = Integer.parseInt(scanner.nextLine());


        int counter = 1;


        for (int i = 1; i <= maleCount; i++) {
            for (int j = 1; j <= femaleCount; j++) {
                if (counter <= tablesCount) {
                    System.out.printf("(%d <-> %d) ", i, j);
                }
                counter++;
            }
        }


    }
}
