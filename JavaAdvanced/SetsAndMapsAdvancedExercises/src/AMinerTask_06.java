import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resources = new LinkedHashMap<>();
        String resource = scanner.nextLine();

        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!resources.containsKey(resource)) {
                resources.put(resource, quantity);
            } else {
                int currentQuantity = resources.get(resource);
                resources.put(resource, currentQuantity + quantity);
            }
            resource = scanner.nextLine();
        }

        resources.entrySet().forEach(e -> System.out.printf("%s -> %d%n", e.getKey(), e.getValue()));


    }
}
