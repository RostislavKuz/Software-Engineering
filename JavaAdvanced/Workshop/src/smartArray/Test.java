package smartArray;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        SmartArray smartArray = new SmartArray();

        // add
        for (int i = 1; i <= 20; i++) {
            smartArray.add(i);
        }

        // size
        System.out.println(smartArray.size());

        // get
        System.out.println(smartArray.get(5));

        // remove
        System.out.println(smartArray.remove(6));

        // contains
        System.out.println(smartArray.contains(6));
        System.out.println(smartArray.contains(7));

        // add
        smartArray.add(6, 7);
        System.out.println(smartArray.contains(7));

        // foreach
        smartArray.foreach(e -> System.out.print(e + " "));
    }
}
