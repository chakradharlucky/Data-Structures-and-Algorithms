import java.util.*;
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
        list1.appendAtStart(10);
        list1.appendAtEnd(30);
        list1.appendAtPosition(20, 1);
        System.out.print("List 1: ");
        list1.printList();
        System.out.println("Length of the list: "+list1.listLength());
        list2.appendAtEnd(1);
        list2.appendAtStart(3);
        list2.appendAtPosition(2, 1);
        System.out.print("List 2: ");
        list2.printList();
        System.out.println("Length of the list: "+list2.listLength());

    }
}