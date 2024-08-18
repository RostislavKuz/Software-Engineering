import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MemoryGame_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        List<String> numbers = new ArrayList<>();

        for (String string : array) {
            numbers.add(string);
        }
        int moves = 0;

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] tokens = command.split(" ");
            int firstIndex = Integer.parseInt(tokens[0]);
            int secondIndex = Integer.parseInt(tokens[1]);


            moves++;

            if (firstIndex == secondIndex || firstIndex < 0 || firstIndex > numbers.size() - 1 || secondIndex < 0 || secondIndex > numbers.size() - 1) {
                int middleIndex = numbers.size() / 2;
                String element = "-" + moves + "a";
                numbers.add(middleIndex, element);
                numbers.add(middleIndex, element);
                System.out.println("Invalid input! Adding additional elements to the board");
            } else {
                if (numbers.get(firstIndex).equals(numbers.get(secondIndex))) {
                    String removedElement = numbers.get(firstIndex);
                    if (firstIndex > secondIndex) {
                        numbers.remove(firstIndex);
                        numbers.remove(secondIndex);
                    } else {
                        numbers.remove(secondIndex);
                        numbers.remove(firstIndex);
                    }
                    System.out.printf("Congrats! You have found matching elements - %s!%n", removedElement);
                } else {
                    System.out.println("Try again!");
                }


            }

            if (numbers.isEmpty()) {
                System.out.printf("You have won in %d turns!%n", moves);
                break;
            }


            command = scanner.nextLine();
        }

        if (!numbers.isEmpty()) {
            System.out.println("Sorry you lose :(");
            System.out.println(String.join(" ", numbers));
        }


    }


}
