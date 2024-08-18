import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> quests = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];

            if (tokens.length == 3) {
                if (quests.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    quests.add(name);
                }
            } else {
                if (quests.contains(name)) {
                    quests.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }

        for (String quest : quests) {
            System.out.println(quest);
        }


    }
}
