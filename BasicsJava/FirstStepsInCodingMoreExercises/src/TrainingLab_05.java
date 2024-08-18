import java.util.Scanner;

public class TrainingLab_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        int tables = (int) ((h * 100) - 100) / 70;
        int rows = (int) (w * 100) / 120;

        int numberOfWorkPlaces = rows * tables - 3;


        System.out.printf("%d", numberOfWorkPlaces);


    }
}
