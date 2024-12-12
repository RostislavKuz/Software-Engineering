package customLinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

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

    public void addLast(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
        }
        this.size++;
    }

    public int get(int index) {
        int result = 0;
        checkValidIndex(index);
        if (index <= this.size / 2) {
            Node currentNode = this.head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
            result = currentNode.currentValue;
        } else {
            Node currentNode = this.tail;
            for (int i = this.size - 1; i > index; i--) {
                currentNode = currentNode.prev;
            }
            result = currentNode.currentValue;
        }
        return result;
    }

    public int removeFirst() {
        int removedElement;
        if (isEmpty()) {
            throw new IllegalStateException("Error while remove element from empty list!");
        } else if (this.size == 1) {
            removedElement = this.head.currentValue;
            this.head = this.tail = null;
            size--;
        } else {
            removedElement = this.head.currentValue;
            this.head = this.head.next;
            this.head.prev = null;
            this.size--;
        }
        return removedElement;
    }

    public int removeLast() {
        int removedElement;
        if (isEmpty()) {
            throw new IllegalStateException("Error while remove element from empty list!");
        } else if (this.size == 1) {
            removedElement = this.tail.currentValue;
            this.head = this.tail = null;
            size--;
        } else {
            removedElement = this.tail.currentValue;
            this.tail = this.tail.prev;
            this.tail.next = null;
            this.size--;
        }
        return removedElement;
    }

    public void forEach(Consumer<Integer> consumer) {
        Node currentNode = this.head;
        while (currentNode != null) {
            consumer.accept(currentNode.currentValue);
            currentNode = currentNode.next;
        }
    }

    public int[] toArray() {
        List<Integer> resultList = new ArrayList<>();
        forEach(el -> resultList.add(el));
        return resultList.stream().mapToInt(e -> e).toArray();
    }

    private void checkValidIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("The index " + index + " is out of bounds!");
        }
    }

    public boolean isEmpty() {
        // true -> empty
        // false -> not empty
        return this.size == 0;
    }
}
