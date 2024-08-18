import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juryCount = Integer.parseInt(scanner.nextLine());

        double allParticipantsAverageGrade = 0;
        int counter = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("Finish")) {
                break;
            }
            counter++;

            String presentationName = input;

            double averagePresentationGrade = 0;

            for (int i = 0; i < juryCount; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                averagePresentationGrade += grade;
            }

            averagePresentationGrade /= juryCount;
            allParticipantsAverageGrade += averagePresentationGrade;

            System.out.printf("%s - %.2f.%n", presentationName, averagePresentationGrade);

        }
        allParticipantsAverageGrade /= counter;
        System.out.printf("Student's final assessment is %.2f.%n", allParticipantsAverageGrade);

    }
}
