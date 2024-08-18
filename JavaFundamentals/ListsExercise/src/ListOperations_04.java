import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = ParseLineOfNumbers(scanner);

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            switch (command) {
                case "Add":
                    numbers.add(Integer.parseInt(tokens[1]));
                    break;
                case "Insert":
                    int index = Integer.parseInt(tokens[2]);
                    if (index < numbers.size() && index >= 0) {
                        numbers.add(index, Integer.parseInt(tokens[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    index = Integer.parseInt(tokens[1]);
                    if (index < numbers.size() && index >= 0) {
                        numbers.remove(index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    String direction = tokens[1];
                    int count = Integer.parseInt(tokens[2]);
                    shift(numbers, direction, count);
                    break;
            }
            input = scanner.nextLine();
        }

        for (int number : numbers) {
            System.out.printf("%d ", number);
        }


    }

    private static void shift(List<Integer> numbers, String direction, int count) {

        switch (direction) {
            case "left":
                for (int i = 0; i < count; i++) {
                    int first = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(first);
                }
                break;
            case "right":
                for (int i = 0; i < count; i++) {
                    int last = numbers.get(numbers.size() - 1);
                    numbers.remove(numbers.size() - 1);
                    numbers.add(0, last);
                }
                break;
        }


    }

    private static List<Integer> ParseLineOfNumbers(Scanner scanner) {
        String[] numbersAsString = scanner.nextLine().split("\\s+");

        List<Integer> numbers = new ArrayList<>();

        for (String string : numbersAsString) {
            int number = Integer.parseInt(string);
            numbers.add(number);
        }
        return numbers;
    }
}
