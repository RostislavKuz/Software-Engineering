import java.util.*;

public class StudentAcademy_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> studentGrades = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            List<Double> grades = studentGrades.get(name);
            if (grades == null) {
                grades = new ArrayList<>();
                studentGrades.put(name, grades);
            }
            grades.add(grade);
        }

        studentGrades.entrySet()
                .stream()
                .filter(s -> s.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble() >= 4.50)
                .forEach(s -> System.out.printf("%s -> %.2f%n", s.getKey(), s.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble()));


    }
}
