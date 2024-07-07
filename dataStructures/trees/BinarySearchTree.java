package dataStructures.trees;

public class BinarySearchTree {

    public Node root;

    public BinarySearchTree (int value) {
        this.root = new Node(value);
    }

    /**
     * Node
 
     */
   public class Node {

    public int value;
    public Node left;
    public Node right;
        Node(int value) {
            this.value = value;
        }
    }

    public boolean insertIterative(int value) {
        Node newNode = new Node(value);
        if(this.root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if(newNode.value == temp.value) return false;
            if(newNode.value < temp.value) {
                if(temp.left == null) {
                    temp.left = newNode;
                    return true;
                } 
                temp = temp.left;
            }
            else {
                if(temp.right == null){
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public void insertRecursive(int value) {
        this.root = this.insertRecursive(root, value);
    }

    private Node insertRecursive(Node root, int value) {
        // Assumption is insertrecursive insert a value at apropriate position
        if(root == null) return new Node(value);
        if(root.value == value) return root;   // Redundant value is not allowed to store
        if(root.value > value) root.left = insertRecursive(root.left, value); // inserting the value in apropriate position in left sub tree
        if(root.value < value) root.right = insertRecursive(root.right, value); // inserting the value in apropriate position in rigth sub tree
        return root; // returning the control with root, if insertion done
    }

    public void preOrder() {
        this.preOrder(root);
    }

    private void preOrder(Node root) {
        // Assumption is preOrder prints the per order of a BST
        if(root == null) return;
        System.out.print(root.value+" "); // prints the root value
        preOrder(root.left); // prints the pre order of the left sub tree
        preOrder(root.right); // prints the pre order of the right sub tree
    }
}
