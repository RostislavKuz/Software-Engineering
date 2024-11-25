package CompanyRoster_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] employeeInformation = scanner.nextLine().split("\\s+");
            String name = employeeInformation[0];
            double salary = Double.parseDouble(employeeInformation[1]);
            String position = employeeInformation[2];
            String department = employeeInformation[3];

            Employee employee = null;

            if (employeeInformation.length == 6) {
                String email = employeeInformation[4];
                int age = Integer.parseInt(employeeInformation[5]);
                employee = new Employee(name, salary, position, department, email, age);
            } else if (employeeInformation.length == 4) {
                employee = new Employee(name, salary, position, department);
            } else if (employeeInformation.length == 5) {
                String forthParameter = employeeInformation[4];
                if (forthParameter.contains("@")) {
                    String email = forthParameter;
                    employee = new Employee(name, salary, position, department, email);
                } else {
                    int age = Integer.parseInt(forthParameter);
                    employee = new Employee(name, salary, position, department, age);
                }
            }

        }


    }
}
