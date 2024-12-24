package ListUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(1);
        list.add(15);
        list.add(150);
        list.add(-150);

        System.out.println(ListUtils.getMax(list));
        System.out.println(ListUtils.getMin(list));
        System.out.println(ListUtils.getMin(new ArrayList<String>()));

    }
}
