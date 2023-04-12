package BinTree;
public class BinTree{

    static class Node{
        public int data;
        public Node left;
        public Node right;

        public Node(){}
        
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

    public Node getRoot(){
        return root;
    }

    public void preOrder(Node localroot){
        if (localroot != null){
            System.out.println(localroot.data + " ");
            preOrder(localroot.left);
            preOrder(localroot.right);
        }
    }

    public void inOrder(Node localroot){
        if (localroot != null){
            inOrder(localroot.left);
            System.out.println(localroot.data + " ");
            inOrder(localroot.right);
        }
    }

    public void postOrder(Node localroot){
        if (localroot != null){
            postOrder(localroot.left);
            postOrder(localroot.right);
            System.out.println(localroot.data + " ");
        }
    }

    public int height(Node t){
        if(isEmptyTree(t)){
            return 0;
        } else {
            int leftHeight = height(t.left);
            int rightHeight = height(t.right);
            if(leftHeight > rightHeight){
                return leftHeight + 1;
            } else {
                return rightHeight + 1;
            }
        }
    }

    public int quantity(Node t){
        if(isEmptyTree(t)){
            return 0;
        } else {
            int lef = quantity(t.left);
            int rig = quantity(t.right);
            return lef + rig + 1;
        }
    }

    public boolean isLeaf(Node t){
        if(isEmptyTree(t)){
            return false;
        } else if(isEmptyTree(t.left) && isEmptyTree(t.right)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equals(Node t, Node q){
        if(isEmptyTree(t) && isEmptyTree(q)){
            return true;
        } else if (isEmptyTree(t) || isEmptyTree(q)){
            return false;
        } else if (t.data == q.data){
            return equals(t.left, q.left) && equals(t.right, q.right);
        } else {
            return false;
        }
    }

    
}