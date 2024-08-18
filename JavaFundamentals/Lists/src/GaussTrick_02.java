import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GaussTrick_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = parseLineOfNumbers(scanner);
        List<Integer> newList = new ArrayList<>();


        for (int i = 0; i < numbers.size() / 2; i++) {
            int first = numbers.get(i);
            int last = numbers.get(numbers.size() - 1 - i);

            newList.add(first + last);

        }

        if (numbers.size() % 2 != 0) {
            newList.add(numbers.get(numbers.size() / 2));
        }

        for (int number : newList) {
            System.out.print(number + " ");
        }
    }

    private static List<Integer> parseLineOfNumbers(Scanner scanner) {
        String[] numbersAsString = scanner.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<>();

        for (String string : numbersAsString) {
            int number = Integer.parseInt(string);
            numbers.add(number);
        }
        return numbers;
    }
}
