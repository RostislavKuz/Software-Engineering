package smartArray;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        SmartArray smartArray = new SmartArray();
        smartArray.add(1);
        smartArray.add(2);
        smartArray.add(3);
        smartArray.add(4);
        // resize
        smartArray.add(5);
        System.out.println(smartArray.size());

        //1:04


    }
}
