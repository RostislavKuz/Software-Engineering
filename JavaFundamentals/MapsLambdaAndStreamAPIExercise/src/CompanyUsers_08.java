import java.util.*;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companies = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] tokens = input.split(" ");
            String companyName = tokens[0];
            String employeeId = tokens[2];

            List<String> employeeList = companies.get(companyName);
            if (employeeList == null) {
                employeeList = new ArrayList<>();
                companies.put(companyName, employeeList);
            }
            if (!employeeList.contains(employeeId)) {
                employeeList.add(employeeId);
            }
            input = scanner.nextLine();
        }

        companies.entrySet().stream().forEach(c -> {
            System.out.println(c.getKey());
            c.getValue()
                    .stream()
                    .forEach(e -> System.out.println("-- " + e));
        });
    }
}
