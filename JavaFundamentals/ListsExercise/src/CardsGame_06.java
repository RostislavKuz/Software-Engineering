import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstHand = parseLineOfNumber(scanner);
        List<Integer> secondHand = parseLineOfNumber(scanner);


        while (firstHand.size() != 0 && secondHand.size() != 0) {

            int firstHandNumber = firstHand.get(0);
            int secondHandNumber = secondHand.get(0);

            if (firstHandNumber == secondHandNumber) {
                firstHand.remove(0);
                secondHand.remove(0);
            } else if (firstHandNumber > secondHandNumber) {
                firstHand.add(firstHandNumber);
                firstHand.add(secondHandNumber);
                firstHand.remove(0);
                secondHand.remove(0);
            } else {
                secondHand.add(secondHandNumber);
                secondHand.add(firstHandNumber);
                firstHand.remove(0);
                secondHand.remove(0);
            }
        }

        int sum = 0;

        if (firstHand.size() != 0) {
            for (int integer : firstHand) {
                sum += integer;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }
        if (secondHand.size() != 0) {
            for (int integer : secondHand) {
                sum += integer;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }


    }

    private static List<Integer> parseLineOfNumber(Scanner scanner) {
        String[] numbersAsString = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        for (String string : numbersAsString) {
            int number = Integer.parseInt(string);
            numbers.add(number);
        }
        return numbers;
    }
}
