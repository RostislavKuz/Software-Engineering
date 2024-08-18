import java.util.*;

public class CountRealNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Double, Integer> numberOccurrences = new TreeMap<>();

        String[] numbersAsStrings = scanner.nextLine().split(" ");
        for (int i = 0; i < numbersAsStrings.length; i++) {
            double number = Double.parseDouble(numbersAsStrings[i]);

            Integer occurrences = numberOccurrences.get(number);
            if (occurrences == null) {
                occurrences = 0;
            }

            numberOccurrences.put(number, occurrences + 1);
        }

        for (Map.Entry<Double, Integer> entry : numberOccurrences.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }


    }
}
