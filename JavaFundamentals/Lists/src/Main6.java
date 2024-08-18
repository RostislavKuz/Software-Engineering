import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = parseLineOfNumbers(scanner);

        List<Integer> nonNegativeNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number >= 0) {
                nonNegativeNumbers.add(number);
            }
        }

        for (int number : nonNegativeNumbers) {
            System.out.print(number + " ");
        }
    }


    private static List<Integer> parseLineOfNumbers(Scanner scanner) {
        String line = scanner.nextLine();
        String[] numbersAsStrings = line.split(" ");

        List<Integer> numbers = new ArrayList<>();

        for (String string : numbersAsStrings) {
            int number = Integer.parseInt(string);
            numbers.add(number);
        }
        return numbers;
    }
}
