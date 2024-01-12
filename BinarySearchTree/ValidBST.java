package BinarySearchTree;

public class ValidBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }else{
            root.right= insert(root.right,val);
        }
        return root;
    }
public static boolean isValidBST(Node root,Node min,Node max){
    if(root == null){
        return true;
    }
    if(min != null && root.data <= min.data){
        return false;
    }
    else if(max != null && root.data >= max.data){
        return false;
    }
    return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
}
    public static void main(String args[]) {
        // int values[] = { 8, 5,4, 3, 6, 10, 11,15,17, 14 }; //{1,1,1} not valid condition invalid
        // Node root = null;

        // for (int i = 0; i < values.length; i++) {
        //     root = insert(root, values[i]);
        // }

        // inorder(root);
        // System.out.println();
        Node root = new Node(50);
        root.left =new Node(30);
        root.left.left= new Node (5);
        root.left.right= new Node(20);
        root.right= new Node(60);
        root.right.left= new Node(45);
        root.right.right=new Node(75);
        root.right.right.right= new Node(80);
        root.right.right.left = new Node(65);

        if(isValidBST(root, null, null))
        {
             System.out.println("It is valid BST");
        }else{
            System.out.println("It is not valid");
        }
    }

}
