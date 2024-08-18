import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PokemonDontGo_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = parseLineOfNumbers(scanner);

        int sumOfRemovedNumbers = 0;

        while (numbers.size() != 0) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number < 0) {
                int lastDigit = numbers.get(numbers.size() - 1);
                int removedNumber = numbers.get(0);
                numbers.set(0, lastDigit);
                sumOfRemovedNumbers += removedNumber;

                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) <= removedNumber) {
                        numbers.set(i, numbers.get(i) + removedNumber);
                    } else {
                        numbers.set(i, numbers.get(i) - removedNumber);
                    }
                }
            } else if (number > numbers.size() - 1) {
                int firsDigit = numbers.get(0);
                int removedNumber = numbers.get(numbers.size() - 1);
                numbers.set(numbers.size() - 1, firsDigit);
                sumOfRemovedNumbers += removedNumber;

                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) <= removedNumber) {
                        numbers.set(i, numbers.get(i) + removedNumber);
                    } else {
                        numbers.set(i, numbers.get(i) - removedNumber);
                    }
                }
            } else {
                int digit = numbers.get(number);
                sumOfRemovedNumbers += digit;
                numbers.remove(number);

                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) <= digit) {
                        numbers.set(i, numbers.get(i) + digit);
                    } else {
                        numbers.set(i, numbers.get(i) - digit);
                    }
                }
            }
        }

        System.out.println(sumOfRemovedNumbers);
    }

    private static List<Integer> parseLineOfNumbers(Scanner scanner) {
        String[] numbersAsString = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        for (String string : numbersAsString) {
            int number = Integer.parseInt(string);
            numbers.add(number);
        }
        return numbers;
    }
}
