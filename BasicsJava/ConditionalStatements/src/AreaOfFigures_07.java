import java.util.Scanner;

public class AreaOfFigures_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();
        double result = 0;

        if (figure.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            result = side * side;
        } else if (figure.equals("rectangle")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            result = sideA * sideB;
        } else if (figure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            result = radius * radius * Math.PI;
        } else if (figure.equals("triangle")) {
            double side = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            result = side * height / 2;
        }

        System.out.printf("%.3f", result);
    }
}
