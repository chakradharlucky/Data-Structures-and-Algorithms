import genericLinkedList.*;
public class StringLinkedList {
    public static void main(String[] args) {
        GenericLinkedList<String> str_list = new GenericLinkedList<String>();
        str_list.appendAtStart("Lakinana");
        str_list.appendAtEnd("B.Tech");
        str_list.appendAtPosition("Chakradhar", 1);
        str_list.appendAtEnd("CSE");
        str_list.printList();
    }
}
