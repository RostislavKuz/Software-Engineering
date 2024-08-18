import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulationAdvanced_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = parseLineOfNumbers(scanner);

        String[] command = scanner.nextLine().split(" ");

        while (!command[0].equals("end")) {

            switch (command[0]) {
                case "Contains":
                    boolean thereIsANumber = false;
                    for (int number : numbers) {
                        if (number == Integer.parseInt(command[1])) {
                            thereIsANumber = true;
                        }
                    }
                    if (thereIsANumber) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (command[1].equals("even")) {
                        for (int number : numbers) {
                            if (number % 2 == 0) {
                                System.out.printf("%d ", number);
                            }
                        }
                        System.out.println();
                    } else {
                        for (int number : numbers) {
                            if (number % 2 != 0) {
                                System.out.printf("%d ", number);
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int sum = 0;
                    if (command[1].equals("sum")) {
                        for (int number : numbers) {
                            sum += number;
                        }
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    if (command[1].equals(">=")) {
                        for (int number : numbers) {
                            if (number >= Integer.parseInt(command[2])) {
                                System.out.printf("%d ", number);
                            }
                        }
                        System.out.println();
                    } else if (command[1].equals("<")) {
                        for (int number : numbers) {
                            if (number < Integer.parseInt(command[2])) {
                                System.out.printf("%d ", number);
                            }
                        }
                        System.out.println();
                    } else if (command[1].equals(">")) {
                        for (int number : numbers) {
                            if (number > Integer.parseInt(command[2])) {
                                System.out.printf("%d ", number);
                            }
                        }
                        System.out.println();
                    } else if (command[1].equals("<=")) {
                        for (int number : numbers) {
                            if (number <= Integer.parseInt(command[2])) {
                                System.out.printf("%d ", number);
                            }
                        }
                    }
                    break;
            }
            command = scanner.nextLine().split(" ");
        }


    }

    private static List<Integer> parseLineOfNumbers(Scanner scanner) {
        String[] numbersAsString = scanner.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<>();

        for (String string : numbersAsString) {
            int number = Integer.parseInt(string);
            numbers.add(number);
        }
        return numbers;
    }
}
