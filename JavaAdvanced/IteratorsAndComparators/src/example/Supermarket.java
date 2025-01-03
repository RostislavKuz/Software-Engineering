package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Supermarket implements Iterable<String> {
    private List<String> fruits;

    public Supermarket(String... fruits) {
        this.fruits = new ArrayList<>(Arrays.asList(fruits));
    }

    public List<String> getFruits() {
        return fruits;
    }

    public void setFruits(List<String> fruits) {
        this.fruits = fruits;
    }

    @Override
    public Iterator<String> iterator() {
        //return this.fruits.iterator();
        return new ShopAssistant();
    }

    private class ShopAssistant implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return this.index < fruits.size();
        }

        @Override
        public String next() {
            return fruits.get(index++);
        }
    }
}
