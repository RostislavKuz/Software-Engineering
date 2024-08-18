import java.util.Scanner;

public class BonusScoringSystem_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        int numberOfLectures = Integer.parseInt(scanner.nextLine());
        int bonus = Integer.parseInt(scanner.nextLine());

        int maxAttendance = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            int studentAttendance = Integer.parseInt(scanner.nextLine());
            if (studentAttendance > maxAttendance) {
                maxAttendance = studentAttendance;
            }
        }

        double totalBonus = Math.round((maxAttendance / (double) numberOfLectures) * (5 + bonus));

        System.out.printf("Max Bonus: %.0f.%n", totalBonus);
        System.out.printf("The student has attended %d lectures.", maxAttendance);


    }
}
