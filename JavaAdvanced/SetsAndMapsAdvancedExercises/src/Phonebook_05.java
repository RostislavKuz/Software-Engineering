import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phonebook = new HashMap<>();

        String data = scanner.nextLine();
        while (!data.equals("search")) {
            String[] nameAndNumber = data.split("-");
            String name = nameAndNumber[0];
            String phoneNumber = nameAndNumber[1];
            phonebook.put(name, phoneNumber);
            data = scanner.nextLine();
        }

        String name = scanner.nextLine();
        while (!name.equals("stop")) {

            if (phonebook.containsKey(name)) {
                System.out.printf("%s -> %s%n", name, phonebook.get(name));
            } else {
                System.out.printf("Contact %s does not exist.%n", name);
            }


            name = scanner.nextLine();
        }


    }
}
