import genericDoublyLinkedList.*;
public class DoublyLL {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>(40);
        list.appendAtEnd(60);
        list.appendAtEnd(70);
        list.appendAtStart(20);
        list.appendAtStart(10);
        list.appendAtPosition(30, 3);
        list.appendAtPosition(50, 4);
        System.out.print("List: ");
        list.printList();
        System.out.println("Length of the list: "+list.listLength());
        System.out.println("Remove Operations: ");
        list.removeAtStart();
        list.removeAtEnd();
        list.removeAtPosition(3);
        System.out.print("List: ");
        list.printList();
        System.out.println("Length of the list: "+list.listLength());
    }
}
