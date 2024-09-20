import java.util.*;

public class AverageStudentsGrades_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, List<Double>> students = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] nameAndGrade = scanner.nextLine().split("\\s+");
            String name = nameAndGrade[0];
            double grade = Double.parseDouble(nameAndGrade[1]);

            List<Double> studentGrades = students.get(name);
            if (studentGrades == null) {
                studentGrades = new ArrayList<>();
                students.put(name, studentGrades);
            }
            studentGrades.add(grade);
        }

        students.entrySet()
                .stream()
                .forEach(s -> {
                    System.out.printf("%s -> ", s.getKey());
                    s.getValue().stream().forEach(g -> System.out.printf("%.2f ", g));
                    System.out.printf("(avg: %.2f)", s.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble());
                    System.out.println();
                });


    }
}
