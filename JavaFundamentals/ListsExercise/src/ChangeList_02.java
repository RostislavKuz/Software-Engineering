import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = parseLineOfNumbers(scanner);

        String[] command = scanner.nextLine().split("\\s+");

        while (!command[0].equals("end")) {

            switch (command[0]) {

                case "Delete":

                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) == Integer.parseInt(command[1])) {
                            numbers.remove(i);
                            i--;
                        }
                    }
                    break;
                case "Insert":
                    numbers.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
                    break;


            }

            command = scanner.nextLine().split("\\s+");
        }

        for (int number : numbers) {
            System.out.printf("%d ", number);
        }


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
