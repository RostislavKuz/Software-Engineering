import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAdjacentEqualNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = parseLineOfNumbers(scanner);

        boolean search = true;
        while (search) {
            search = false;
            for (int i = 0; i < numbers.size() - 1; i++) {
                int current = numbers.get(i);
                int next = numbers.get(i + 1);

                if (current == next) {
                    numbers.remove(i);
                    numbers.set(i, current + next);
                    search = true;
                    break;
                }
            }
        }


        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static List<Integer> parseLineOfNumbers(Scanner scanner) {
        String line = scanner.nextLine();
        String[] numbersAsString = line.split(" ");

        List<Integer> numbers = new ArrayList<>();

        for (String string : numbersAsString) {
            int number = Integer.parseInt(string);
            numbers.add(number);
        }
        return numbers;
    }
}
