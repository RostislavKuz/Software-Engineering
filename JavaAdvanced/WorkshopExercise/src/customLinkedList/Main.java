package customLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();

        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addLast(9);

        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println();

        linkedList.forEach(e -> System.out.println(e));

        System.out.println("--------------");

        int[] array = linkedList.toArray();

        for (int element : array) {
            System.out.print(element + " ");

        }


    }
}
