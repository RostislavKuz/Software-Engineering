import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnonymousThreat_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split("\\s+");
        List<String> listOfStrings = new ArrayList<>();
        for (String string : array) {
            listOfStrings.add(string);
        }


        String input = scanner.nextLine();

        while (!input.equals("3:1")) {
            String[] command = input.split("\\s+");

            int startIndex = Integer.parseInt(command[1]);
            int endIndex = Integer.parseInt(command[2]);

            if (command[0].equals("merge")) {

                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > listOfStrings.size() - 1) {
                    endIndex = listOfStrings.size() - 1;
                }

                merge(listOfStrings, startIndex, endIndex);

            } else {
                int index = Integer.parseInt(command[1]);
                int partitions = Integer.parseInt(command[2]);
                divide(listOfStrings, index, partitions);
            }


            input = scanner.nextLine();
        }

        for (String string : listOfStrings) {
            System.out.printf("%s ", string);
        }


    }

    private static void divide(List<String> listOfStrings, int index, int partitions) {
        

    }

    private static void merge(List<String> listOfStrings, int startIndex, int endIndex) {

        for (int i = startIndex; i < endIndex; i++) {
            listOfStrings.set(startIndex, listOfStrings.get(startIndex) + listOfStrings.get(startIndex + 1));
            listOfStrings.remove(startIndex + 1);
        }

    }
}
