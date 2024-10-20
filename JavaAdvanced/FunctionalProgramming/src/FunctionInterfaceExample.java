import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionInterfaceExample {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("5");
        myList.add("3");
        myList.add("7");
        Function<String, Integer> func = e -> Integer.parseInt(e);
        Function<Integer, Integer> square = e -> e * e;

        System.out.println(square.apply(12));

        myList.stream()
                .map(func)
                .map(square)
                .forEach(System.out::println);


    }
}
