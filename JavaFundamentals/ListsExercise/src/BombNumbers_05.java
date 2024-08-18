import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = parseLineOfNumbers(scanner);
        List<Integer> bombInfo = parseLineOfNumbers(scanner);

        int bombNum = bombInfo.get(0);
        int power = bombInfo.get(1);

        while (list.contains(bombNum)) {
            int bombPosition = list.indexOf(bombNum);

            int leftBound = Math.max(0, bombPosition - power);
            int rightBound = Math.min(list.size() - 1, bombPosition + power);

            for (int i = rightBound; i >= leftBound; i--) {
                list.remove(i);
            }
        }

        int sum = 0;
        for (int integer : list) {
            sum += integer;
        }
        System.out.println(sum);
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
