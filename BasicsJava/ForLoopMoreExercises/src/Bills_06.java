import java.util.Scanner;

public class Bills_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());

        double totalElectricity = 0;
        double other = 0;

        for (int i = 0; i < months; i++) {

            double electricity = Double.parseDouble(scanner.nextLine());

            totalElectricity += electricity;
            other = other + ((electricity + 20 + 15) * 1.20);
        }

        double averageBill = (totalElectricity + 20 * months + 15 * months + other) / months;

        System.out.printf("Electricity: %.2f lv%n", totalElectricity);
        System.out.printf("Water: %.2f lv%n", 20 * 1.0 * months);
        System.out.printf("Internet: %.2f lv%n", 15 * 1.0 * months);
        System.out.printf("Other: %.2f lv%n", other);
        System.out.printf("Average: %.2f lv", averageBill);
    }
}
