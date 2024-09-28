import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> symbols = new TreeMap<>();
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char currentCharacter = input.charAt(i);
            if (!symbols.containsKey(currentCharacter)) {
                symbols.put(currentCharacter, 1);
            } else {
                int symbolCounter = symbols.get(currentCharacter);
                symbols.put(currentCharacter, symbolCounter + 1);
            }
        }

        symbols.entrySet().forEach(e -> System.out.printf("%c: %d time/s%n", e.getKey(), e.getValue()));


        //2:40


    }
}
