package smartArray;

public class SmartArray {
    public static final int INITIAL_CAPACITY = 4;
    public static final int INITIAL_SIZE = 0;
    public static final int SHRINK_THRESHOLD = 4;
    private int[] data;
    private int size;
    private int capacity;

    public SmartArray() {
        this.size = INITIAL_SIZE;
        this.capacity = INITIAL_CAPACITY;
        this.data = new int[INITIAL_CAPACITY];
    }

    public void add(int element) {
        this.ensureCapacity();
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
            String errorMessage = String.format("Index %d is out of bounds of our SmartArray", index);
            throw new IndexOutOfBoundsException(errorMessage);
        }
    }

    public int remove(int index) {
        int numberToRemove = this.get(index);
        this.shiftLeft(index);
        this.size--;
        if (this.capacity / this.size > SHRINK_THRESHOLD) {
            this.shrink();
        }
        return numberToRemove;
    }

    private void shrink() {
        this.capacity = this.capacity / 2;
        int temp[] = new int[this.capacity];

        for (int i = 0; i < this.size; i++) {
            temp[i] = this.data[i];
        }
        this.data = temp;
    }

    private void shiftLeft(int index) {
        for (int i = index; i < this.size - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.data[size - 1] = 0;
    }

    public boolean contains(int element) {
        for (int i = 0; i < this.size; i++) {
            if (this.data[i] == element) {
                return true;
            }
        }
        return false;
    }

    public void add(int index, int element) {
        this.checkIndex(index);
        this.ensureCapacity();
        this.shiftRight(index);
        this.data[index] = element;
        size++;
    }

    private void shiftRight(int index) {
        for (int i = this.size - 1; i >= index; i--) {
            this.data[i + 1] = this.data[i];
        }
    }

    private void ensureCapacity() {
        if (this.size == this.capacity) {
            this.resize();
        }
    }


}
