package froggy;

import java.util.Iterator;

public class Lake implements Iterable<Integer> {
    private int[] numbers;

    public Lake(int[] numbers) {
        this.numbers = numbers;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    private class Frog implements Iterator<Integer> {
        int index = 0;
        int counter = 0;


        @Override
        public boolean hasNext() {
            return this.counter < numbers.length;
        }

        @Override
        public Integer next() {
            int number = numbers[this.index];
            if (this.index + 2 <= numbers.length - 1) {
                this.index += 2;
            } else {
                this.index = 1;
            }
            counter++;
            return number;
        }
    }
}
