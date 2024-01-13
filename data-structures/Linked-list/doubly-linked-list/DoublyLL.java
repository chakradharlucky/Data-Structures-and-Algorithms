import genericDoublyLinkedList.*;
public class DoublyLL {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>(10);
        list.appendAtEnd(20);
        list.appendAtStart(1);
        list.appendAtPosition(50, 1);
        list.printList();
    }
}
