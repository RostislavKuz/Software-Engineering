import java.util.*;

public class UserLogs_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> data = new TreeMap<>();
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] inputParts = input.split("\\s+");
            String ip = inputParts[0].split("=")[1];
            String message = inputParts[1].split("=")[1];
            String username = inputParts[2].split("=")[1];

            if (!data.containsKey(username)) {
                Map<String, Integer> messagesCount = new LinkedHashMap<>();
                messagesCount.put(ip, 1);
                data.put(username, messagesCount);
            } else {
                Map<String, Integer> currentIps = data.get(username);
                if (currentIps.containsKey(ip)) {
                    int currentTimes = currentIps.get(ip);
                    currentIps.put(ip, currentTimes + 1);
                } else {
                    currentIps.put(ip, 1);
                }
            }
            input = scanner.nextLine();
        }


        data.keySet().forEach(username -> {
            System.out.printf("%s:%n", username);
            Map<String, Integer> ips = data.get(username);
            ips.entrySet().forEach(entry -> {
                int countIps = ips.size();
                if (countIps > 1) {
                    System.out.println(entry.getKey() + " => " + entry.getValue() + ",");
                    countIps-=1;
                }else {
                    System.out.println(entry.getKey() + " => " + entry.getValue() + ".");
                }
            });


        });


    }
}
