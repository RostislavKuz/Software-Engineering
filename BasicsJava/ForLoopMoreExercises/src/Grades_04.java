import java.util.Scanner;

public class Grades_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());

        int excellent = 0; // 5 или повече
        int good = 0; // между 4 и 4,99
        int average = 0; // между 3 и 3,99
        int weak = 0; //по-малко от 3

        double sum = 0;

        for (int i = 0; i < students; i++) {

            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 3) {
                weak++;
            } else if (grade < 4) {
                average++;
            } else if (grade < 5) {
                good++;
            } else {
                excellent++;
            }

            sum += grade;
        }

        double topStudentsPercent = excellent * 1.0 / students * 100;
        double goodPercent = good * 1.0 / students * 100;
        double averagePercent = average * 1.0 / students * 100;
        double failPercent = weak * 1.0 / students * 100;
        double averageGrade = sum / students;

        System.out.printf("Top students: %.2f%%%n", topStudentsPercent);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", goodPercent);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", averagePercent);
        System.out.printf("Fail: %.2f%%%n", failPercent);
        System.out.printf("Average: %.2f", averageGrade);
    }
}
