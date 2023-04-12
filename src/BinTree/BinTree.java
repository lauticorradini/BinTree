package BinTree;

public class BinTree{

    static class Node{
        public int data;
        public Node left;
        public Node right;

        public Node(int val){ 
            data = val;
            left = null;
            right = null;
        }

        public int getVal(){
            return this.data;
        }

        public Node getRight() {
            return this.right;
        }

        public Node getLeft(){
            return this.left;
        }
    }

    private Node root; 

    public BinTree(){
        root = null;
    }

    public BinTree(Node root){
        this.root = root;
    }
    

    public Boolean isEmptyTree(Node t){
        return t == null;
    }

    public void insert(int val){
        if (root == null){
            root = new Node(val);
        } else {
            insertNode(root,val);
        }
    }

    private void insertNode(Node node, int val){
        if (val < node.data){
            if (node.left == null){
                node.left = new Node(val);
            } else {
                insertNode(node.left, val);
            }
        } else {
            if (node.right == null){
                node.right = new Node(val);
            } else {
                insertNode(node.right, val);
            }
        }
    }

    public void insertLeftNode(Node tree, Node leftNode){
        if(!isEmptyTree(tree)){
            tree.left = leftNode;
        }
    }

    public void insertRightNode(Node tree, Node rightNode){
        if(!isEmptyTree(tree)){
            tree.right = rightNode;
        }
    }

    public Node getRoot(){
        return root;
    }



    //recorridos PREORDER, INORDER & POSTORDER

    
}