import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(3);
        myList
                .stream()
                .map(a -> a * a)
                .forEach(System.out::println);
    }

    public static int square(Integer a) {
        return a * a;
    }
}