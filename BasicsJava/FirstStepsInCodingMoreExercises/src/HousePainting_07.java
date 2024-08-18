import java.util.Scanner;

public class HousePainting_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        //Стени

        double sideWallArea = x * y;
        double window = 1.5 * 1.5;
        double totalSideWallsArea = (sideWallArea - window) * 2;

        double backWallArea = x * x;
        double door = 1.2 * 2;
        double frontAndBackWallsArea = backWallArea * 2 - door;

        double totalArea = totalSideWallsArea + frontAndBackWallsArea;
        double greenPaint = totalArea / 3.4;

        //Покрив

        double roofRectangle = (x * y) * 2;
        double roofTriangle = (x * h / 2) * 2;

        double totalRoofArea = roofRectangle + roofTriangle;
        double redPaint = totalRoofArea / 4.3;

        System.out.printf("%.2f%n", greenPaint);
        System.out.printf("%.2f", redPaint);


    }
}
