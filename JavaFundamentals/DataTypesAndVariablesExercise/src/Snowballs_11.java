import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double highestSnowballValue = 0;
        int highestSnow = 0;
        int highestTime = 0;
        int highestQuality = 0;
        for (int i = 0; i < n; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());


            double snowballValue = Math.pow((snowballSnow * 1.0 / snowballTime), snowballQuality);

            if (snowballValue > highestSnowballValue) {
                highestSnowballValue = snowballValue;
                highestSnow = snowballSnow;
                highestTime = snowballTime;
                highestQuality = snowballQuality;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)", highestSnow, highestTime, highestSnowballValue, highestQuality);
    }
}
