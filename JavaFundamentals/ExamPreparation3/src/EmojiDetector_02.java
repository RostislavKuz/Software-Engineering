import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        List<String> coolEmojis = new ArrayList<>();
        int foundEmojis = 0;
        int coolThreshold = 1;

        Pattern PatternDigit = Pattern.compile("\\d");
        Matcher matcher = PatternDigit.matcher(text);
        while (matcher.find()) {
            coolThreshold *= Integer.parseInt(matcher.group());
        }

        String expression = "(::|\\*\\*)(?<emoji>[A-Z][a-z]{2,})(\\1)";
        Pattern pattern = Pattern.compile(expression);

        matcher = pattern.matcher(text);
        while (matcher.find()) {
            foundEmojis++;
            String emoji = matcher.group("emoji");
            int lettersValue = 0;
            for (int i = 0; i < emoji.length(); i++) {
                int value = emoji.charAt(i);
                lettersValue += value;
            }

            if (lettersValue > coolThreshold) {
                coolEmojis.add(matcher.group());
            }
        }

        System.out.printf("Cool threshold: %d%n", coolThreshold);
        System.out.printf("%d emojis found in the text. The cool ones are: %n", foundEmojis);
        for (String coolEmoji : coolEmojis) {
            System.out.println(coolEmoji);
        }


    }
}
