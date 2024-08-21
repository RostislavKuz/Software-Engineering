import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = "(@#+)(?<code>[A-Z][A-Za-z0-9]{4,}[A-Z])(@#+)";
        Pattern pattern = Pattern.compile(expression);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                Pattern patternDigit = Pattern.compile("\\d+");
                StringBuilder sb = new StringBuilder();
                matcher = patternDigit.matcher(input);
                while (matcher.find()) {
                    sb.append(matcher.group());
                }
                if (sb.isEmpty()) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.println("Product group: " + sb);
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
