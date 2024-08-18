import java.util.*;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> wordsMap = new LinkedHashMap<>();

        String[] words = scanner.nextLine().toLowerCase().split(" ");

        for (String word : words) {

            Integer occurrences = wordsMap.get(word);
            if (occurrences == null) {
                occurrences = 0;
            }
            wordsMap.put(word, occurrences + 1);
        }

        List<String> odds = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                odds.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", odds));


    }
}
