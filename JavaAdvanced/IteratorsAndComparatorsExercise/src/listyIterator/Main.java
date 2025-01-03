package listyIterator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String createInput = scanner.nextLine();
        List<String> data = Arrays.stream(createInput.split("\\s+"))
                .skip(1).collect(Collectors.toList());

        ListyIterator listyIterator = new ListyIterator(data);

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            switch (command) {
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "Print":
                    try {
                        listyIterator.print();
                    } catch (Exception e) {
                        System.out.println("Invalid Operation!");
                    }
                    break;
            }


            command = scanner.nextLine();
        }

    }
}
