import java.util.Arrays;
import java.util.Scanner;

public class TreasureFinder_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] keys = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        String command = scanner.nextLine();

        while (!command.equals("find")) {

            StringBuilder sb = new StringBuilder();
            String line = command;
            int keyIndex = 0;
            for (int i = 0; i < line.length(); i++) {
                char element = line.charAt(i);
                while (keyIndex < keys.length) {
                    int key = keys[keyIndex];
                    char result = (char) (element - key);
                    sb.append(result);

                    keyIndex++;
                    if (keyIndex > keys.length - 1) {
                        keyIndex = 0;
                    }
                    break;
                }

            }
            String message = sb.toString();

            int firstIndexTreasure = message.indexOf("&");
            int lastIndexTreasure = message.indexOf("&", firstIndexTreasure + 1);
            String treasure = message.substring(firstIndexTreasure + 1, lastIndexTreasure);

            int firstIndexCoordinate = message.indexOf("<");
            int lastIndexCoordinate = message.indexOf(">");
            String coordinate = message.substring(firstIndexCoordinate + 1, lastIndexCoordinate);

            System.out.println("Found " + treasure + " at " + coordinate);


            command = scanner.nextLine();


        }
    }
}
