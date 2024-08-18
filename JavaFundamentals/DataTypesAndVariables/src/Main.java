import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = Integer.parseInt(scanner.nextLine());
        final int unixEpochTimeStartYear = 1970;

        int yearsPassed = year - unixEpochTimeStartYear;

        System.out.println(yearsPassed);


        final long secondsInYear = 365 * 24 * 60 * 60;

        long epochTime = yearsPassed * secondsInYear;

        System.out.println(epochTime);

    }
}