import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class AddVAT_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] prices = scanner.nextLine().split(", ");

        Function<String, Double> parseToDouble = e -> Double.parseDouble(e);
        //Function<Double, Double> addVat = e -> e * 1.2;
        UnaryOperator<Double> addVat = e -> e * 1.2;
        Consumer<Double> printer = e -> System.out.printf("%.2f%n", e);

        Arrays.stream(prices)
                .map(parseToDouble)
                .map(addVat)
                .forEach(printer);


    }
}
