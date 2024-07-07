import dataStructures.trees.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(50);
        // bst.insertRecursive(20); 
        // bst.insertRecursive(70); 
        // bst.insertRecursive(70); 
        bst.insertIterative(70);
        bst.insertIterative(20);
        bst.insertIterative(70);

        bst.preOrder();
    }
}
