import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindEvensOrOdds_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] range = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int lowerBound = range[0];
        int upperBound = range[1];

        List<Integer> numbers = new ArrayList<>();
        for (int i = lowerBound; i <= upperBound; i++) {
            numbers.add(i);
        }

        String command = scanner.nextLine();

        Predicate<Integer> findNumber;

        if (command.equals("even")) {
            findNumber = number -> number % 2 == 0;
        } else {
            findNumber = number -> number % 2 != 0;
        }

        List<Integer> filteredNumbers = numbers.stream().filter(findNumber).collect(Collectors.toList());

        filteredNumbers.stream().forEach(number -> System.out.printf("%d ", number));

    }
}
