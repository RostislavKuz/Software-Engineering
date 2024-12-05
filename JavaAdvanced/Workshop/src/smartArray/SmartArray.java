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
        this.data[size] = element;
        this.size++;
    }
    public void resize(){
        
    }

    public int size() {
        return this.size;
    }
}
