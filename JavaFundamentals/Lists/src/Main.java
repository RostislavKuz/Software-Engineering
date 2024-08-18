import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Array

        int[] array = new int[]{42, 13, 255};
        System.out.println(array.length);
        System.out.println(array[0]);
        array[0] = 5;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("---------------------------");

        //List

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.size());
        list.add(42);
        list.add(13);
        list.add(255);
        System.out.println(list.size());
        System.out.println(list.get(0));
        list.set(0, 5);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}