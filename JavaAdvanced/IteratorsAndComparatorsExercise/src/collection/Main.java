package collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String createCommand = scanner.nextLine();
        List<String> data = Arrays.stream(createCommand.split("\\s+")).skip(1).collect(Collectors.toList());
        ListyIterator listyIterator = new ListyIterator();

        listyIterator.create(data);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            switch (input) {
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    try {
                        listyIterator.print();
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid Operation!");
                    }
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "PrintAll":
                    listyIterator.printAll();
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
