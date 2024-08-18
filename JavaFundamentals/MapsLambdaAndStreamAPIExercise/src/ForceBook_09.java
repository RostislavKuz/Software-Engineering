import java.util.*;

public class ForceBook_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> profiles = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Lumpawaroo")) {
            String[] tokens = input.split(" ");
            if (tokens[1].equals("|") || tokens[2].equals("|")) {
                String[] info = input.split(" \\| ");
                String side = info[0];
                String name = info[1];

                List<String> users = profiles.get(side);
                if (users == null) {
                    users = new ArrayList<>();
                    profiles.put(side, users);
                }
                if (!users.contains(name)) {
                    profiles.forEach((key, value) -> value.remove(name));
                    users.add(name);
                }
            } else {
                String[] tokens2 = input.split(" -> ");
                String side = tokens2[1];
                String name = tokens2[0];

                List<String> users = profiles.get(side);
                if (users == null) {
                    users = new ArrayList<>();
                    profiles.put(side, users);
                }
                if (!users.contains(name)) {
                    profiles.forEach((key, value) -> value.remove(name));
                    System.out.println(name + " joins the " + side + " side!");
                    users.add(name);
                }
            }
            input = scanner.nextLine();
        }

        profiles.entrySet()
                .stream()
                .filter(s -> s.getValue().size() > 0)
                .forEach(s -> {
                    System.out.println("Side: " + s.getKey() + ", Members: " + s.getValue().size());
                    s.getValue()
                            .stream()
                            .forEach(n -> System.out.println("! " + n));
                });


    }
}
