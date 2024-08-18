import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String expression = "[A-Z][A-Za-z]+";
        String text = "Hello regular expressions, this is l3cture number 7 in the java fundamentals course at SoftUni in 2020.";

        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(text);


        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}