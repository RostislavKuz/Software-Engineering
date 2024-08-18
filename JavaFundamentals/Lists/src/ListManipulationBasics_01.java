import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulationBasics_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = parseLineOfNumbers(scanner);

        String[] command = scanner.nextLine().split(" ");

        while (!command[0].equals("end")) {

            switch (command[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(command[1]));
                    break;
                case "Remove":
                    numbers.remove((Integer) Integer.parseInt(command[1]));
                    break;
                case "RemoveAt":
                    numbers.remove(Integer.parseInt(command[1]));
                    break;
                case "Insert":
                    int index = Integer.parseInt(command[2]);
                    int digit = Integer.parseInt(command[1]);
                    numbers.add(index, digit);
                    break;
            }
            command = scanner.nextLine().split(" ");
        }

        for (int number : numbers) {
            System.out.printf("%d ", number);
        }


    }

    private static List<Integer> parseLineOfNumbers(Scanner scanner) {
        String[] numbersAsStrings = scanner.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<>();

        for (String string : numbersAsStrings) {
            int number = Integer.parseInt(string);
            numbers.add(number);
        }
        return numbers;
    }
}
