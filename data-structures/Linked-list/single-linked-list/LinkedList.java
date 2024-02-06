public class LinkedList {

    private Node head;
    private Node tail;
    private int length = 0;

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

    public void appendAtStart(int value){
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

    public void appendAtPosition(int value ,int position){
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

    public void appendAtEnd(int value){
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

    public static LinkedList mergeSort(LinkedList list1,LinkedList list2){
        LinkedList obj = new LinkedList();
        obj.head= mergeSort(list1.head, list2.head);
        return obj;
    }
    public static Node mergeSort(Node list1,Node list2){
        if(list1.next == null )
            return list2;
        if(list2.next == null)
            return list1;
        if(list1.value < list2.value)
        {
            list1.next = mergeSort(list1.next,list2);
            return list1;
        }
            list2.next = mergeSort(list1, list2.next);
            return list2;
    }

    public int listLength(){
        return this.length;
    }

    public LinkedList(){
        this.head = null;
        this.tail = null;
    }

    public LinkedList(int value)
    {
        Node newNode = new Node(value);
        this.head = this.tail = newNode;
        this.length = 1;
    }
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        //LIST - 1 
        // Appending nodes at various positions
        System.out.print("\nList 1: ");
        list1.appendAtStart(10);
        list1.appendAtEnd(30);
        list1.appendAtPosition(20, 1);
        list1.appendAtStart(5);
        list1.appendAtEnd(50);
        list1.appendAtPosition(40, 4);
        list1.printList();
        System.out.println("Length of the list: "+list1.listLength());
        // Removing nodes from at various positions
        list1.removeAtStart();
        list1.removeAtEnd();
        list1.removeAtPosition(1);
        System.out.print("\nAfter Remove list - 1: ");
        list1.printList();
        System.out.println("Length of the list: "+list1.listLength());
        
        
        //LIST - 2    
        // Appending nodes at various positions
        System.out.print("\nList 2: ");
        list2.appendAtEnd(1);
        list2.appendAtStart(3);
        list2.appendAtPosition(2, 1);
        list2.appendAtEnd(4);
        list2.appendAtEnd(5);
        list2.appendAtEnd(6);
        list2.printList();
        System.out.println("Length of the list: "+list1.listLength());
        // Removing nodes from at various positions
        list2.removeAtStart();
        list2.removeAtEnd();
        list2.removeAtPosition(0);
        System.out.print("\nAfter Remove list - 2: ");
        list2.printList();
        System.out.println("Length of the list: "+list2.listLength()); 
        LinkedList mergList = mergeSort(list1, list2);
        mergList.printList();

    }
}