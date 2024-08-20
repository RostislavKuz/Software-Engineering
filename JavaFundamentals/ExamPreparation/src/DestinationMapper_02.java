import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String placesString = scanner.nextLine();

        String expression = "([=/])(?<destination>[A-Z][A-Za-z]{2,})(\\1)";

        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(placesString);

        List<String> destinations = new ArrayList<>();
        while (matcher.find()) {
            destinations.add(matcher.group("destination"));
        }

        System.out.println("Destinations: " + String.join(", ", destinations));
        System.out.println("Travel Points: " + destinations.stream().mapToInt(d -> d.length()).sum());

    }
}
