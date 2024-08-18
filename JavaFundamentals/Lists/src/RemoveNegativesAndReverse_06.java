import java.util.*;

public class RemoveNegativesAndReverse_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = parseLineOfNumbers(scanner);

        List<Integer> nonNegativeNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            if (number >= 0) {
                nonNegativeNumbers.add(number);
            }
        }

        if (nonNegativeNumbers.isEmpty()) {
            System.out.println("empty");
        } else {
            Collections.reverse(nonNegativeNumbers);
            for (Integer number : nonNegativeNumbers) {
                System.out.printf("%d ", number);
            }
        }
    }

    private static List<Integer> parseLineOfNumbers(Scanner scanner) {
        String[] numberAsStrings = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String string : numberAsStrings) {
            int number = Integer.parseInt(string);
            numbers.add(number);
        }
        return numbers;
    }
}
