package customList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomList<String> customList = new CustomList<>();

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String commandType = command.split("\\s+")[0];
            switch (commandType) {
                case "Add":
                    String element = command.split("\\s+")[1];
                    customList.add(element);
                    break;
                case "Remove":
                    int index = Integer.parseInt(command.split("\\s+")[1]);
                    System.out.println(customList.remove(index));
                    break;
                case "Contains":
                    String searchedElement = command.split("\\s+")[1];
                    System.out.println(customList.contains(searchedElement));
                    break;
                case "Swap":
                    int firstIndex = Integer.parseInt(command.split("\\s+")[1]);
                    int secondIndex = Integer.parseInt(command.split("\\s+")[2]);
                    customList.swap(firstIndex, secondIndex);
                    break;
                case "Greater":
                    String elementForCheck = command.split("\\s+")[1];
                    System.out.println(customList.countGreaterThan(elementForCheck));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    customList.print();
                    break;
                case "Sort":
                    customList.sort();
                    break;
            }
            command = scanner.nextLine();
        }

        //2:40


    }
}
