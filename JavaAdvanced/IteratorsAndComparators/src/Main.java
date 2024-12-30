import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();

        animals.add("Zebra");
        animals.add("Dog");

        Iterator<String> myIterator = animals.iterator();
        while (myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }
    }
}