import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] array = scanner.nextLine().split(", ");
        List<String> items = new ArrayList<>();

        for (String string : array) {
            items.add(string);
        }

        String input = scanner.nextLine();

        while (!input.equals("Craft!")) {
            String[] command = input.split(" - ");
            switch (command[0]) {
                case "Collect":
                    String item = command[1];
                    if (!items.contains(item)) {
                        items.add(item);
                    }
                    break;
                case "Drop":
                    item = command[1];
                    items.remove(item);
                    break;
                case "Combine Items":
                    String[] oldAndNewItems = command[1].split(":");
                    String oldItem = oldAndNewItems[0];
                    String newItem = oldAndNewItems[1];

                    if (items.contains(oldItem)) {
                        int oldItemIndex = items.indexOf(oldItem);
                        items.add(oldItemIndex + 1, newItem);
                    }
                    break;
                case "Renew":
                    item = command[1];
                    if (items.contains(item)) {
                        items.remove(item);
                        items.add(item);
                    }
                    break;
            }


            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", items));
    }
}
