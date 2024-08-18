import java.util.*;
import java.util.stream.Stream;

public class Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        double sum = 0;


        for (int number : numbers) {
            sum += number;
        }
        double averageNumber = sum / numbers.length;
        
        List<Integer> listOfNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number > averageNumber) {
                listOfNumbers.add(number);
            }
        }

        if (listOfNumbers.isEmpty()) {
            System.out.println("No");
        } else {
            Collections.sort(listOfNumbers);
            Collections.reverse(listOfNumbers);

            if (listOfNumbers.size() < 5) {
                for (Integer number : listOfNumbers) {
                    System.out.printf("%d ", number);
                }
            } else {
                for (int i = 0; i < 5; i++) {
                    System.out.printf("%d ", listOfNumbers.get(i));
                }
            }
        }


    }
}
