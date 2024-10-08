import java.util.Scanner;

public class WorldTour_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder allStops = new StringBuilder(scanner.nextLine());

        String command = scanner.nextLine();
        while (!command.equals("Travel")) {
            String[] commandParts = command.split(":");
            switch (commandParts[0]) {
                case "Add Stop":
                    int insertIndex = Integer.parseInt(commandParts[1]);
                    String insertString = commandParts[2];

                    if (isValidIndex(allStops, insertIndex)) {
                        allStops.insert(insertIndex, insertString);
                    }
                    System.out.println(allStops);
                    break;
                case "Remove Stop":
                    int fromIndex = Integer.parseInt(commandParts[1]);
                    int toIndex = Integer.parseInt(commandParts[2]);

                    if (isValidIndex(allStops, fromIndex) && isValidIndex(allStops, toIndex)) {
                        allStops.replace(fromIndex, toIndex + 1, "");
                    }
                    System.out.println(allStops);
                    break;
                case "Switch":
                    String oldString = commandParts[1];
                    String newString = commandParts[2];

                    allStops = new StringBuilder(allStops.toString().replace(oldString, newString));
                    System.out.println(allStops);
                    break;
            }


            command = scanner.nextLine();
        }

        System.out.println("Ready for world tour! Planned stops: " + allStops);
    }


    static boolean isValidIndex(StringBuilder s, int index) {
        return index >= 0 && index < s.length();
    }
}
