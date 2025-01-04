package stackIterator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*String data = scanner.nextLine().substring(5);
        List<Integer> numbers = Arrays.stream(data.split(", ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
         */

        //List<Integer> numbers = Arrays.stream(scanner.nextLine().split("([, ]+)")).skip(1).map(Integer::parseInt).collect(Collectors.toList());
        CustomStack customStack = new CustomStack();
        /*for (Integer number : numbers) {
            customStack.push(number);
        }
         */

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            if (input.contains("Push")){
                List<Integer> numbers = Arrays.stream(input.split("([, ]+)")).skip(1).map(Integer::parseInt).collect(Collectors.toList());
                for (Integer number : numbers) {
                    customStack.push(number);
                }
            }
            if (input.equals("Pop")) {
                try {
                    customStack.pop();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
            input = scanner.nextLine();
        }

        for (int i = 0; i < 2; i++) {
            for (Integer integer : customStack) {
                System.out.println(integer);
            }
        }

    }
}
