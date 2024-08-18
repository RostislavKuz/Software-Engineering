import java.util.Scanner;

public class Pets_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int kilogramsFood = Integer.parseInt(scanner.nextLine());
        double dogFood = Double.parseDouble(scanner.nextLine());
        double catFood = Double.parseDouble(scanner.nextLine());
        double turtleFood = Double.parseDouble(scanner.nextLine());

        double needFood = (dogFood + catFood + (turtleFood) / 1000) * days;

        if (needFood < kilogramsFood) {
            System.out.printf("%.0f kilos of food left.", Math.floor(kilogramsFood - needFood));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(needFood - kilogramsFood));
        }
    }
}
