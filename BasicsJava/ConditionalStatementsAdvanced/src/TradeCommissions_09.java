import java.util.Scanner;

public class TradeCommissions_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        double commissions = 0;
        boolean isError = false;

        switch (city) {
            case "Sofia":
                if (sales >= 0 && sales <= 500) {
                    commissions = sales * 0.05;
                } else if (sales > 500 && sales <= 1000) {
                    commissions = sales * 0.07;
                } else if (sales > 1000 && sales <= 10000) {
                    commissions = sales * 0.08;
                } else if (sales > 10000) {
                    commissions = sales * 0.12;
                } else {
                    System.out.printf("error");
                    isError = true;
                    break;
                }
                break;
            case "Varna":
                if (sales >= 0 && sales <= 500) {
                    commissions = sales * 0.045;
                } else if (sales > 500 && sales <= 1000) {
                    commissions = sales * 0.075;
                } else if (sales > 1000 && sales <= 10000) {
                    commissions = sales * 0.10;
                } else if (sales > 10000) {
                    commissions = sales * 0.13;
                } else {
                    System.out.printf("error");
                    isError = true;
                    break;
                }
                break;
            case "Plovdiv":
                if (sales >= 0 && sales <= 500) {
                    commissions = sales * 0.055;
                } else if (sales > 500 && sales <= 1000) {
                    commissions = sales * 0.08;
                } else if (sales > 1000 && sales <= 10000) {
                    commissions = sales * 0.12;
                } else if (sales > 10000) {
                    commissions = sales * 0.145;
                } else {
                    System.out.printf("error");
                    isError = true;
                    break;
                }
                break;
            default:
                System.out.printf("error");
                isError = true;
                break;
        }
        if (!isError) {
            System.out.printf("%.2f", commissions);
        }
    }
}
