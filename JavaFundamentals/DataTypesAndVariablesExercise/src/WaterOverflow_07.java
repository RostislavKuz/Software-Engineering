import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int waterTankCapacity = 255;
        int waterInTank = 0;

        for (int i = 0; i < n; i++) {

            int liters = Integer.parseInt(scanner.nextLine());

            if ((waterInTank + liters) > waterTankCapacity) {
                System.out.println("Insufficient capacity!");
            } else {
                waterInTank += liters;
            }
        }

        System.out.println(waterInTank);
    }
}
