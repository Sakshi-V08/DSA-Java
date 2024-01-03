package BinaryTrees;

import java.util.*;

public class HeightOfTrees {
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

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    // count nodes
    public static int count(Node root) {
        if (root == null) {
            return 0;
        }

        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;
    }

    // sum of the nodes
    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        int ls = sum(root.left);
        int rs = sum(root.right);
        return ls + rs + root.data;
    }

    // Diameter of the node
    public static int diameter2(Node root) { // O(n^2) because simulatously i calculated height of n nodes
        if (root == null) {
            return 0;
        }
        int leftDiam = diameter2(root.left);
        int leftHt = height(root.left);
        int rightDiam = diameter2(root.right);
        int rightHt = height(root.right);

        int selfDiam = leftHt + rightHt + 1;

        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    }

    // Approach 2 for finding the diameter
    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root) {   //O(n)
        if(root== null){
            return new Info(0,0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam), leftInfo.ht+rightInfo.ht+1);
        int ht= Math.max(leftInfo.ht,rightInfo.ht)+1;

        return new Info(diam,ht);
    }

    public static void main(String args[]) {
        /*
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         * 
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Print height of tree: " + height(root));
        System.out.println("Print number of nodes in the tree : " + count(root));
        System.out.println("Sum of the nodes : " + sum(root));
        System.out.println("Print diameter of trees: " + (diameter(root).diam));
    }
}

// Leetcode
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
// class Solution {
// private int diameter;

// public int diameterOfBinaryTree(TreeNode root) {
// diameter = 0;
// calculateHeight(root);
// return diameter;
// }

// private int calculateHeight(TreeNode node) {
// if (node == null) {
// return 0;
// }

// int leftHeight = calculateHeight(node.left);
// int rightHeight = calculateHeight(node.right);

// // Diameter passing through the current node
// diameter = Math.max(diameter, leftHeight + rightHeight);

// // Height of the current node
// return Math.max(leftHeight, rightHeight) + 1;
// }
// }