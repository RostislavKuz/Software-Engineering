import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> chars = new LinkedHashMap<>();

        String[] input = scanner.nextLine().split(" ");
        String line = String.join("", input);

        for (int i = 0; i < line.length(); i++) {
            Integer occurrence = chars.get(line.charAt(i));
            if (occurrence == null) {
                occurrence = 0;
            }
            chars.put(line.charAt(i), occurrence + 1);
        }

        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }
}
