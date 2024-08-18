import java.util.Scanner;

public class FishTank_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int volumeCm = length * width * height;
        double liters = volumeCm * 0.001;
        double percentNumber = percent * 0.01;
        double needLiters = liters * (1 - percentNumber);

        System.out.printf("%.3f",needLiters);

    }
}
