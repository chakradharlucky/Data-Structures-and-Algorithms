package genericDoublyLinkedList;
public class DoublyLinkedList< type > {
    
    private Node head = null;
    private Node tail = null;
    private int length = 0;
    class Node{
        type value;
        Node next = null;
        Node previous=null;
        Node(type value)
        {
            this.value = value;
        }
    }
    public void appendAtStart(type value)
    {
        Node newNode = new Node(value);
        if(length == 0)
        {
            this.head = this.tail = newNode;
        }
        else{
            newNode.next = this.head;
            head.previous = newNode;
            head = newNode;
        }
        this.length++;
    }

    public void appendAtPosition(type value,int position)
    {
        if(position <= 0) appendAtStart(value);
        else if(position >= length ) appendAtEnd(value);
        else{
            Node newNode = new Node(value);
            Node temp = this.head;
            for(int i=1;i<position;i++){
                temp = temp.next;
            }
            length++;
        }
    }

    public void appendAtEnd(type value)
    {
        Node newNode = new Node(value);
        if(length == 0)
        {
            this.head = this.tail = newNode;
        }
        else{
            this.tail.next = newNode;
            newNode.previous = this.tail;
            this.tail = newNode;
        }
        this.length++;
    }

    public void printList(){
        Node temp = this.head;
        while (temp!=null) {
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }

   public DoublyLinkedList(type value){
        Node newNode = new Node(value);
        this.head = this.tail = newNode;
        this.length++;
    }
}