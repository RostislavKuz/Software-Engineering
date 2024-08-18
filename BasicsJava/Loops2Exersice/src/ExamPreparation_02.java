import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poorGrades = Integer.parseInt(scanner.nextLine());

        int badGrades = poorGrades;

        double sum = 0;
        double averageGrade = 0;
        int countProblem = 0;
        String lastProblem = "";

        while (poorGrades > 0) {
            String problem = scanner.nextLine();
            if (problem.equals("Enough")) {
                System.out.println();
                break;
            }
            lastProblem = problem;

            double grade = Double.parseDouble(scanner.nextLine());
            if (grade <= 4) {
                poorGrades--;
            }
            sum += grade;

            countProblem++;

        }

        if (poorGrades > 0) {
            averageGrade = sum / countProblem;
            System.out.printf("Average score: %.2f%n", averageGrade);
            System.out.printf("Number of problems: %d%n", countProblem);
            System.out.printf("Last problem: %s%n", lastProblem);
        }
        if (poorGrades == 0) {
            System.out.printf("You need a break, %d poor grades.", badGrades);
        }


    }
}
