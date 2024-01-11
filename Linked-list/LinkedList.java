public class LinkedList {

    private Node head;
    private Node tail;
    int length = 0;
    public class Node{
        int value;
        Node next = null;
        public Node(int value)
        {
            this.value = value;
        }
    }

    public void printList(){
        Node temp = this.head;
        while (temp!=null) {
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void appendAtEnd(int value){
        Node newNode = new Node(value);
        if(this.tail == null && this.head == null){
            this.head = this.tail = newNode;
        }
        else{
            this.tail = this.tail.next = newNode;
        }
    }
    public LinkedList(){
        this.head = null;
        this.tail = null;
    }

    public LinkedList(int value)
    {
        Node newNode = new Node(value);
        this.head = this.tail = newNode;
        length = 1;
    }
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList(10);
        list1.appendAtEnd(20);
        list1.appendAtEnd(30);
        list1.appendAtEnd(40);
        list1.appendAtEnd(50);
        list1.printList();
    }
}