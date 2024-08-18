import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String bannedWord : bannedWords) {
            text = text.replace(bannedWord, repeat("*", bannedWord.length()));
        }

        System.out.println(text);

    }


    private static String repeat(String word, int count) {
        String[] repeatArray = new String[count];
        for (int i = 0; i < count; i++) {
            repeatArray[i] = word;
        }
        return String.join("", repeatArray);
    }
}
