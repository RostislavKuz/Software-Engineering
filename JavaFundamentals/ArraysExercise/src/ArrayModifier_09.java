import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        while (true) {
            String[] input = scanner.nextLine().split(" ");
            String command = input[0];

            if (command.equals("end")) {
                break;
            }

            switch (command) {
                case "swap":
                    int first = numbers[Integer.parseInt(input[1])];
                    int second = numbers[Integer.parseInt(input[2])];

                    numbers[Integer.parseInt(input[2])] = first;
                    numbers[Integer.parseInt(input[1])] = second;
                    break;
                case "multiply":
                    int firstMultiply = numbers[Integer.parseInt(input[1])];
                    int secondMultiply = numbers[Integer.parseInt(input[2])];

                    numbers[Integer.parseInt(input[1])] = firstMultiply * secondMultiply;
                    break;
                case "decrease":
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = numbers[i] - 1;
                    }
                    break;
            }

        }

        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.printf("%d, ", numbers[i]);
        }
        System.out.println(numbers[numbers.length - 1]);


    }
}
