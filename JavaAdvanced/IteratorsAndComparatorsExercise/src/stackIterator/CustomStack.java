package stackIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomStack implements Iterable<Integer> {
    private List<Integer> numberStack;

    public CustomStack() {
        this.numberStack = new ArrayList<>();
    }

    public void push(int number) {
        this.numberStack.add(number);
    }

    public int pop() {
        if (this.numberStack.isEmpty()) {
            //System.out.println("No elements");
            throw new IndexOutOfBoundsException("No elements");
        }
        int lastNumberIndex = this.numberStack.size() - 1;
        int lastNumber = this.numberStack.get(lastNumberIndex);
        this.numberStack.remove(lastNumberIndex);
        return lastNumber;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Helper();
    }

    public class Helper implements Iterator<Integer> {
        int currentIndex = numberStack.size() - 1;

        @Override
        public boolean hasNext() {
            return currentIndex >= 0;
        }

        @Override
        public Integer next() {
            return numberStack.get(currentIndex--);
        }
    }
}
