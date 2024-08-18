import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "swap":
                    int firstIndex = Integer.parseInt(command[1]);
                    int secondIndex = Integer.parseInt(command[2]);
                    swapElements(numbers, firstIndex, secondIndex);
                    break;
                case "multiply":
                    firstIndex = Integer.parseInt(command[1]);
                    secondIndex = Integer.parseInt(command[2]);
                    multiplyElements(numbers, firstIndex, secondIndex);
                    break;
                case "decrease":
                    decrease(numbers);
                    break;
            }
            input = scanner.nextLine();
        }

        printArray(", ", numbers);


    }


    private static void printArray(String separator, int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(separator);
            }
        }

    }

    private static void decrease(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] -= 1;
        }

    }

    private static void multiplyElements(int[] numbers, int firstIndex, int secondIndex) {
        numbers[firstIndex] = numbers[firstIndex] * numbers[secondIndex];
    }

    private static void swapElements(int[] numbers, int firstIndex, int secondIndex) {
        int firstNumber = numbers[firstIndex];
        int secondNumber = numbers[secondIndex];

        numbers[secondIndex] = firstNumber;
        numbers[firstIndex] = secondNumber;
    }
}
