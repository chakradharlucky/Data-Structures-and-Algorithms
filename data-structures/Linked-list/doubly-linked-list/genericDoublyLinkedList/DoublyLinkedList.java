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
        if(position <= 1) appendAtStart(value);
        else if(position > length ) appendAtEnd(value);
        else{
            Node newNode = new Node(value);
            Node temp = this.head;
            for(int i=1;i<position;i++){
                temp = temp.next;
            }
            temp.previous.next = newNode;
            newNode.previous = temp.previous;
            temp.previous = newNode;
            newNode.next = temp;
            this.length++;
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

    public void removeAtStart(){
        Node temp = this.head;
        this.head = temp.next;
        this.head.previous = null;
        temp.next = null;
        System.out.println(temp.value+" removed from starting of the list");
        temp = null;
    }
    
    public void removeAtPosition(int position)
    {
        Node temp = this.head;
        for(int i=1 ;i<position;i++)
        temp = temp.next;
        temp.previous.next = temp.next;
        temp.next.previous = temp.previous;
        System.out.println(temp.value+" removed from "+ position +" positions of the list");
        temp.next = temp.previous = null;
    }
    
    public void removeAtEnd(){
        Node temp = this.tail; // or traverse to the end of the list,loop conditon temp.next!=null;
        this.tail = temp.previous;
        temp.previous = null;
        tail.next = null;
        System.out.println(temp.value+" removed from end of the list");
        temp = null;
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