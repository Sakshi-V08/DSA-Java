package BinarySearchTree;

public class DeleteNode {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val); // create newNode and store in root and return
            return root;
        }

        if (root.data > val) {
            // left subtree
            root.left = insert(root.left, val);
        } else {
            // right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // To delete node from a binary search tree
    public static Node delNode(Node root, int val) {
        if (root.data < val) {
            root.right = delNode(root.right, val);
        } else if (root.data > val) {
            root.left = delNode(root.left, val);
        } else {
            // voila
            // case 1 - leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3 - both children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delNode(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String args[]) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

        root = delNode(root, 1);
        System.out.println();

        inorder(root);
    }
}
