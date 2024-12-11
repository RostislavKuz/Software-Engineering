package customLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }
        this.size++;
    }

    public boolean isEmpty() {
        // true -> empty
        // false -> not empty
        return this.size == 0;
    }
}
