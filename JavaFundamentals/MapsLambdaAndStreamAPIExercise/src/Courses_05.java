import java.util.*;

public class Courses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courseInfo = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" : ");
            String course = tokens[0];
            String studentName = tokens[1];

            List<String> students = courseInfo.get(course);
            if (students == null) {
                students = new ArrayList<>();
                courseInfo.put(course, students);
            }
            students.add(studentName);

            input = scanner.nextLine();
        }

        /*for (Map.Entry<String, List<String>> entry : courseInfo.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("-- %s%n", entry.getValue().get(i));
            }
        }*/

        courseInfo.entrySet().stream().forEach(e -> {
            System.out.println(e.getKey() + ": " + e.getValue().size());
            e.getValue()
                    .stream()
                    .forEach(s -> System.out.println("-- " + s));
        });

    }
}
