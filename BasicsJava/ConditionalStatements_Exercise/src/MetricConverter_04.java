import java.util.Scanner;

public class MetricConverter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        String from = scanner.nextLine();
        String to = scanner.nextLine();

        if (from.equals("m")) {
            if (to.equals("m")) {
                number = number;
            } else if (to.equals("mm")) {
                number *= 1000;
            } else if (to.equals("cm")) {
                number *= 100;
            }
        } else if (from.equals("mm")) {
            if (to.equals("mm")) {
                number = number;
            } else if (to.equals("cm")) {
                number /= 10;
            } else if (to.equals("m")) {
                number /= 1000;
            }
        } else if (from.equals("cm")) {
            if (to.equals("cm")) {
                number = number;
            } else if (to.equals("mm")) {
                number *= 10;
            } else if (to.equals("m")) {
                number /= 100;
            }
        }

        System.out.printf("%.3f", number);


    }
}
