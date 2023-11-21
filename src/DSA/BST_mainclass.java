package DSA;
public class BST_mainclass {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(1);
        tree.insert(5);
        tree.insert(3);
        tree.insert(2);
        tree.insert(4);
        tree.insert(7);
        tree.insert(6);
        tree.insert(8);
        tree.displ();
    }
}

class BSTNode{
    int data;
    BSTNode left, right;
    BSTNode(){
        left = right = null;
        data = 0;
    }

    BSTNode(int d){
        data = d;
    }

    void setLeft(BSTNode n){
        left = n;
    }
    
    void setRight(BSTNode n){
        right = n;
    }

    BSTNode getLeft(){
        return left;
    }

    BSTNode getRight(){
        return right;
    }

    void setData(int d){
        data = d;
    }

    int getData(){
        return data;
    }
}

class BST{
    BSTNode root;
    BST(){
        root = null;
    }
    boolean Isempty(){
        return root == null;
    }

    public void insert(int data){
        root = insert(root,data);
    }

    BSTNode insert(BSTNode root, int data){
        if (root == null) {
            root = new BSTNode(data);
        }
        else{
            if (data <= root.getData()) {
                root.left = insert(root.left, data);
            }
            else{
                root.right = insert(root.right, data);
            }
        }
        return root;
    }

    void displ(){
        display(root);
    }

    void display(BSTNode root){
        if (root != null) {
            display(root.left);
            System.out.println(root.data);
            display(root.right);
        }
    }
}