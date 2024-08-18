import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        numbers.add(42);
        numbers.add(13);
        numbers.add(69);

        numbers.remove(1);
        //numbers.remove((Integer) 13);

        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}
