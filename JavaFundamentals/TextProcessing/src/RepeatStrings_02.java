import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        List<String> repeatedWords = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            repeatedWords.add(repeat(words[i], words[i].length()));
        }
        System.out.println(String.join("", repeatedWords));

    }

    private static String repeat(String word, int count) {
        String[] repeatArray = new String[count];
        for (int i = 0; i < count; i++) {
            repeatArray[i] = word;
        }
        return String.join("", repeatArray);
    }
}
