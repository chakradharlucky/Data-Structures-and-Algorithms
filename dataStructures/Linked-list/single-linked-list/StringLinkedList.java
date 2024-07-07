import genericLinkedList.*;
public class StringLinkedList {
    public static void main(String[] args) {
        GenericLinkedList<String> str_list = new GenericLinkedList<String>();
        str_list.appendAtStart("Lakinana");
        str_list.appendAtEnd("B.Tech");
        str_list.appendAtPosition("Chakradhar", 1);
        str_list.appendAtEnd("CSE");
        System.out.print("Original List: ");
        str_list.printList();
        System.out.print("Reverse List: ");
        str_list.reverseList();
        str_list.printList();
    }
}
