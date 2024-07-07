import BinarySearchTree from "./BinarySearchTree.js";
const bst = new BinarySearchTree(50)
bst.insertRecursive(20)
bst.insertRecursive(70)
bst.insertRecursive(10)
bst.insertRecursive(60)
console.log(bst)
// bst.preorder()