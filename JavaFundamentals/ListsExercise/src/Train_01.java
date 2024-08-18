import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = parseLineOfNumbers(scanner);

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String[] command = scanner.nextLine().split(" ");

        while (!command[0].equals("end")) {

            if (command[0].equals("Add")) {
                wagons.add(Integer.parseInt(command[1]));
            } else {
                int passengers = Integer.parseInt(command[0]);

                for (int i = 0; i < wagons.size(); i++) {

                    if (wagons.get(i) + passengers <= maxCapacity) {
                        int totalPassengers = wagons.get(i) + passengers;
                        wagons.set(i, totalPassengers);
                        break;
                    }

                }
            }
            command = scanner.nextLine().split(" ");
        }

        for (int wagon : wagons) {
            System.out.printf("%d ", wagon);
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
