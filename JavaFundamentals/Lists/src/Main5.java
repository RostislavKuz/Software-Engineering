import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] numbersAsStrings = line.split(" ");

        List<Integer> numbers = new ArrayList<>();

       /*
        for (int i = 0; i < numbersAsStrings.length; i++) {
            int number = Integer.parseInt(numbersAsStrings[i]);
            numbers.add(number);
        }
        */

        for (String string : numbersAsStrings) {
            int number = Integer.parseInt(string);
            numbers.add(number);
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }




    }
}
