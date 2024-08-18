import java.util.Scanner;

public class TailoringWorkshop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tables = Integer.parseInt(scanner.nextLine());
        double tableLength = Double.parseDouble(scanner.nextLine());
        double tableWidth = Double.parseDouble(scanner.nextLine());

        double tableclothArea = tables * (tableLength + 2 * 0.30) * (tableWidth + 2 * 0.30);
        double tableCarriageArea = tables * (tableLength / 2) * (tableLength / 2);

        double usdPrice = (tableclothArea * 7) + (tableCarriageArea * 9);
        double bgnPrice = usdPrice * 1.85;

        System.out.printf("%.2f USD%n", usdPrice);
        System.out.printf("%.2f BGN", bgnPrice);
    }
}
