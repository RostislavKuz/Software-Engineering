import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Desi");
        list.add("Ivan");

        System.out.println(getAtIndex(list, 1));

        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);

        System.out.println(getAtIndex(numbers, 1));

    }


    public static <T> T getAtIndex(List<T> list, int index) {
        T element = list.get(index);
        return element;
    }


}