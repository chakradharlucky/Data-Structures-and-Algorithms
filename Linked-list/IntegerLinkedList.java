import genericLinkedList.*;
public class IntegerLinkedList {
    public static void main(String[] args) {
        GenericLinkedList<Integer> int_list = new GenericLinkedList<Integer>();
        System.out.print("\nList: ");
        int_list.appendAtStart(10);
        int_list.appendAtEnd(30);
        int_list.appendAtPosition(20, 1);
        int_list.appendAtStart(5);
        int_list.appendAtEnd(50);
        int_list.appendAtPosition(40, 4);
        int_list.printList();
        System.out.println("Length of the list: "+int_list.listLength());
        // Removing nodes from at various positions
        int_list.removeAtStart();
        int_list.removeAtEnd();
        int_list.removeAtPosition(1);
        System.out.print("\nAfter Remove list - 1: ");
        int_list.printList();
        System.out.println("Length of the list: "+int_list.listLength());
    }
}
