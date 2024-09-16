import java.util.*;

public class SoftUniParty_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Set<String> vipGuests = new HashSet<>();
        Set<String> regularGuests = new HashSet<>();

        while (!input.equals("PARTY")) {
            if (Character.isDigit(input.charAt(0))) {
                vipGuests.add(input);
            } else {
                regularGuests.add(input);
            }
            input = scanner.nextLine();
        }

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            if (Character.isDigit(command.charAt(0))) {
                vipGuests.remove(command);
            } else {
                regularGuests.remove(command);
            }
            command = scanner.nextLine();
        }

        int counter = vipGuests.size() + regularGuests.size();

        System.out.println(counter);
        vipGuests.forEach(System.out::println);
        regularGuests.forEach(System.out::println);


    }
}
