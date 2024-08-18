import java.util.Scanner;

public class SchoolCamp_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        double price = 0;
        String sport = "";

        switch (season) {
            case "Winter":
                if (groupType.equals("boys")) {
                    price = studentsCount * 9.60 * nights;
                    sport = "Judo";
                } else if (groupType.equals("girls")) {
                    price = studentsCount * 9.60 * nights;
                    sport = "Gymnastics";
                } else {
                    price = studentsCount * 10 * nights;
                    sport = "Ski";
                }
                if (studentsCount >= 50) {
                    price *= 0.5;
                } else if (studentsCount >= 20) {
                    price *= 0.85;
                } else if (studentsCount >= 10) {
                    price *= 0.95;
                }
                System.out.printf("%s %.2f lv.", sport, price);
                break;
            case "Spring":
                if (groupType.equals("boys")) {
                    price = studentsCount * 7.20 * nights;
                    sport = "Tennis";
                } else if (groupType.equals("girls")) {
                    price = studentsCount * 7.20 * nights;
                    sport = "Athletics";
                } else {
                    price = studentsCount * 9.50 * nights;
                    sport = "Cycling";
                }
                if (studentsCount >= 50) {
                    price *= 0.5;
                } else if (studentsCount >= 20) {
                    price *= 0.85;
                } else if (studentsCount >= 10) {
                    price *= 0.95;
                }
                System.out.printf("%s %.2f lv.", sport, price);
                break;
            case "Summer":
                if (groupType.equals("boys")) {
                    price = studentsCount * 15 * nights;
                    sport = "Football";
                } else if (groupType.equals("girls")) {
                    price = studentsCount * 15 * nights;
                    sport = "Volleyball";
                } else {
                    price = studentsCount * 20 * nights;
                    sport = "Swimming";
                }
                if (studentsCount >= 50) {
                    price *= 0.5;
                } else if (studentsCount >= 20) {
                    price *= 0.85;
                } else if (studentsCount >= 10) {
                    price *= 0.95;
                }
                System.out.printf("%s %.2f lv.", sport, price);
                break;
        }
    }
}
