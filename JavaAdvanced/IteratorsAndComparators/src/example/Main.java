package example;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket("Apple", "Banana", "Orange");

        Iterator<String> shopAssistant = supermarket.iterator();
        while (shopAssistant.hasNext()){
            System.out.println(shopAssistant.next());
        }





    }
}
