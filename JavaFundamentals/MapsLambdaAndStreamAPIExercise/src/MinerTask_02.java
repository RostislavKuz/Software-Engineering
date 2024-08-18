import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resources = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while (!command.equals("stop")) {
            String resource = command;
            int quantity = Integer.parseInt(scanner.nextLine());

            Integer currentQuantity = resources.get(resource);
            if (currentQuantity == null) {
                currentQuantity = 0;
            }
            resources.put(resource, currentQuantity + quantity);

            command = scanner.nextLine();
        }

        resources.entrySet().forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));

    }
}
