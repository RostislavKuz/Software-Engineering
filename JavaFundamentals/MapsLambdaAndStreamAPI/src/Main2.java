import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        numbers.add(42);
        numbers.add(13);
        numbers.add(68);
        numbers.add(111);
        numbers.add(256);
        Stream<Integer> stream = numbers.stream();


        int[] numbersArray = new int[]{42, 13, 68, 111, 256};
        IntStream stream1 = Arrays.stream(numbersArray);

        int min = Arrays.stream(new int[]{15,25,35}).min().getAsInt();



    }
}
