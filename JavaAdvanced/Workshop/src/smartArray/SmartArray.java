package smartArray;

public class SmartArray {
    public static final int INITIAL_CAPACITY = 4;
    public static final int INITIAL_SIZE = 0;
    private int[] data;
    private int size;
    private int capacity;

    public SmartArray() {
        this.size = INITIAL_SIZE;
        this.capacity = INITIAL_CAPACITY;
        this.data = new int[INITIAL_CAPACITY];
    }

    public void add(int element) {
        if (this.size == this.capacity) {
            this.resize();
        }
        this.data[size] = element;
        this.size++;
    }

    private void resize() {
        this.capacity = this.capacity * 2;
        int[] temp = new int[capacity];
        for (int i = 0; i < this.size; i++) {
            temp[i] = this.data[i];
        }
        this.data = temp;
    }

    public int size() {
        return this.size;
    }

    public int get(int index) {
        this.checkIndex(index);
        return this.data[index];
    }

    private void checkIndex(int index) {
        if (index >= this.size || index < 0) {
            String errorMessage = String.format("Index %d is out of bounds of our SmartArray", index)
            throw new IndexOutOfBoundsException(errorMessage);
        }
    }

}
