import java.util.Scanner;

public class Salary_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int openTabsCount = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        boolean lostSalary = false;

        for (int i = 0; i < openTabsCount; i++) {

            String openTab = scanner.nextLine();

            switch (openTab) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }

            if (salary <= 0) {
                lostSalary = true;
                break;
            }

        }
        if (lostSalary) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);
        }

    }
}
