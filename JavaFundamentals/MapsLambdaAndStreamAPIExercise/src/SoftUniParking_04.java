import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> parkingInfo = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String command = input[0];
            String username = input[1];

            switch (command) {
                case "register":
                    String licensePlateNumber = input[2];
                    if (parkingInfo.get(username) == null) {
                        parkingInfo.put(username, licensePlateNumber);
                        System.out.printf("%s registered %s successfully%n", username, licensePlateNumber);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n", parkingInfo.get(username));
                    }
                    break;
                case "unregister":
                    if (parkingInfo.get(username) != null) {
                        parkingInfo.remove(username);
                        System.out.printf("%s unregistered successfully%n", username);
                    } else {
                        System.out.printf("ERROR: user %s not found%n", username);
                    }
                    break;
            }
        }
        parkingInfo.forEach((k, v) -> System.out.println(k + " => " + v));

    }
}
