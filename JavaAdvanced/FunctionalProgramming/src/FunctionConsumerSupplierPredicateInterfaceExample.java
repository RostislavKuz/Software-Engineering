import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class FunctionConsumerSupplierPredicateInterfaceExample {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("5");
        myList.add("3");
        myList.add("7");

        Function<String, Integer> func = e -> Integer.parseInt(e);
        func.apply("12");

        Function<Integer, Integer> square = e -> e * e;
        square.apply(12);

        BiFunction<Integer, Integer, String> sum = (x, y) -> "Sum is" + (x + y);

        Consumer<Integer> printer = System.out::println;
        printer.accept(12);

        Supplier<Integer> genRandomInt = () -> new Random().nextInt(51);
        genRandomInt.get();

        Predicate<Integer> checkIfEven = e -> e % 2 == 0;
        checkIfEven.test(13);

        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a > b;

        BiConsumer<String, Integer> myBiConsumer = (String name, Integer age) -> System.out.println(name + " " + age);


        myList.stream()
                .map(func)
                .map(square)
                .forEach(printer);


    }
}
