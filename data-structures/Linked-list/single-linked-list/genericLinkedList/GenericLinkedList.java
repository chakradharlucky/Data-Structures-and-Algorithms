package genericLinkedList;

public class GenericLinkedList< type >{
    
    private Node head;
    private Node tail;
    private int length = 0;

    public class Node{

        type value;
        Node next = null;
        public Node(type value)
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

    public void appendAtStart(type value){
        Node newNode = new Node(value);
        if(this.tail==null && this.head == null){
            this.tail = this.head = newNode;
        }
        else{
            newNode.next = head;
            this.head = newNode;
        }
        this.length++;
    }

    public void appendAtPosition(type value ,int position){
        if(position == 0){
            appendAtStart(value);
        }
        else if(position > this.length){
            appendAtEnd(value);
        }    
        else{
            Node newNode = new Node(value);
            Node temp = this.head;
            for(int i=1;i<position;i++)
                temp=temp.next;
            newNode.next = temp.next;
            temp.next = newNode;
        }
        this.length++;
    }

    public void appendAtEnd(type value){
        Node newNode = new Node(value);
        if(this.tail == null && this.head == null){
            this.head = this.tail = newNode;
        }
        else{
            this.tail = this.tail.next = newNode;
        }
        this.length++;
    }

    public void removeAtStart(){
        if(this.head == null){
            System.out.println("List is empty!! No node to remove");
        }
        else{
            System.out.println("Value "+head.value+" removed");
            this.head = head.next;
            if(length == 1)
                tail = null;
            length--;
        }
    }
    
    public void removeAtEnd(){
        if(this.head == null){
            System.out.println("List is empty!! No node to remove");
        }
        else{
            Node temp = this.head;
            while (temp.next != tail) {
                temp= temp.next;                
            }
            System.out.println("Value "+tail.value+" removed");
            tail = temp;
            tail.next = null;
            if(length == 1)
            {
                head = tail = null;
            }
            length--;
        }
    }
    
    public void removeAtPosition(int position)
    {
        if(this.head == null){
            System.out.println("List is empty!! No node to remove");
        }
        else if(position>this.length || position<0){
            System.out.println("Position is out of range to remove a Node");
        }
        else{
            if(position==0){
                removeAtStart();
            }
            else{
                Node tempRemove,tempPrevious = this.head;
                for(int i=1;i<position;i++)
                {
                    tempPrevious = tempPrevious.next;
                }
                tempRemove = tempPrevious.next;
                System.out.println("Value "+tempRemove.value+" removed");
                tempPrevious.next = tempRemove.next;
                this.length--;
            }
        }
    }

    public int listLength(){
        return this.length;
    }

    public GenericLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public GenericLinkedList(type value)
    {
        Node newNode = new Node(value);
        this.head = this.tail = newNode;
        this.length = 1;
    }
}
