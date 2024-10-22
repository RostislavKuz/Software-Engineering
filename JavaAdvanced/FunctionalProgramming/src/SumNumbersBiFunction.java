import java.util.Scanner;
import java.util.function.BiFunction;

public class SumNumbersBiFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] split = scanner.nextLine().split(", ");

        System.out.println("Count = " + split.length);

        BiFunction<Integer, Integer, Integer> parseAndSum = (x, y) -> x + y;
        int sum = 0;
        for (int i = 0; i < split.length; i++) {
            int number = Integer.parseInt(split[i]);
            sum = parseAndSum.apply(sum, number);
        }

        System.out.println("Sum = " + sum);
    }
}
