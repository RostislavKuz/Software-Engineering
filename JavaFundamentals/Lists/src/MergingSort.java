import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergingSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = parseLineOfNumbers(scanner);
        List<Integer> secondList = parseLineOfNumbers(scanner);
        List<Integer> sortedList = new ArrayList<>();

        int indexInFirst = 0;
        int indexInSecond = 0;

        // 1 3 4 5 7
        // 2 6 8

        // 1 2 3 4 5 6 7 8


        while (indexInFirst < firstList.size() && indexInSecond < secondList.size()) {
            if (firstList.get(indexInFirst) < secondList.get(indexInSecond)) {
                sortedList.add(firstList.get(indexInFirst));
                indexInFirst++;
            } else {
                sortedList.add(secondList.get(indexInSecond));
                indexInSecond++;
            }
        }

        while (indexInFirst < firstList.size()) {
            sortedList.add(firstList.get(indexInFirst));
            indexInFirst++;
        }

        while (indexInSecond < secondList.size()) {
            sortedList.add(secondList.get(indexInSecond));
            indexInSecond++;
        }


        for (int number : sortedList) {
            System.out.printf("%d ", number);
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
