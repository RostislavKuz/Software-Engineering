package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable<String> {
    private List<String> data;
    int index;

    public ListyIterator() {
        this.data = new ArrayList<>();
        this.index = 0;
    }

    public ListyIterator(List<String> data) {
        this.data = data;
        this.index = 0;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void create(List<String> otherList) {
        for (int i = 0; i < otherList.size(); i++) {
            this.data.add(otherList.get(i));
        }
    }

    public boolean move() {
        if (this.index < this.data.size() - 1) {
            this.index++;
            return true;
        }
        return false;
    }

    public void print() {
        if (this.data.isEmpty()) {
            throw new IllegalArgumentException("Invalid Operation!");
        } else {
            System.out.println(this.data.get(index));
        }
    }

    public boolean hasNext() {
        return this.index < this.data.size() - 1;
    }

    public void printAll() {
        if (this.data.isEmpty()) {
            throw new IllegalArgumentException("Invalid Operation!");
        } else {
            StringBuilder builder = new StringBuilder();
            for (String d : this.data) {
                builder.append(d).append(" ");
            }
            System.out.println(builder.toString().trim());
        }

    }


    @Override
    public Iterator<String> iterator() {
        return new Helper();
    }

    private class Helper implements Iterator<String> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return this.index < data.size() - 1;
        }

        @Override
        public String next() {
            return data.get(index++);
        }
    }
}
