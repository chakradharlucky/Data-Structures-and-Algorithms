class Node {
    constructor(value) {
        this.value = value
        this.left = null
        this.right = null
    }
}

class BinarySearchTree {
    
    constructor(value){
        this.root = new Node(value);
    }

    insertRecursive(value) {
        this.root = this.#insertRecursive(this.root, value);
    }

    #insertRecursive(root, value){
        if(!root) return new Node(value);
        if(value === root.value) return root;
        if(value < root.value) root.left = this.#insertRecursive(root.left, value);
        if(value > root.value) root.right = this.#insertRecursive(root.right, value);
        return root;
    }

    preorder() {
        this.#preorder(this.root);
    }
    #preorder(root) {
        if(!root) return;
        console.log(root.value);
        this.#preorder(root.left)
        this.#preorder(root.right)
    }
}
export default  BinarySearchTree;