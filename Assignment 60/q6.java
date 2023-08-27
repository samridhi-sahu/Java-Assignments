// 6. Find the length of the diameter of the tree.

import java.util.Scanner;

public class q6 {
    static class node {
        int data;
        node left;
        node right;

        node(int ele) {
            data = ele;
            left = null;
            right = null;
        }
    }

    static class BinaryTree {
        Scanner sc = new Scanner(System.in);

        node create(node root) {
            int data = sc.nextInt();
            root = new node(data);
            if (data == -1)
                return null;
            System.out.println("enter left child data " + data);
            root.left = create(root.left);
            System.out.println("enter right child data " + data);
            root.right = create(root.right);
            return root;
        }

        int diameterOfBinaryTree(node root) {
            if (root == null)
                return 0;
            int dl = diameterOfBinaryTree(root.left);
            int dr = diameterOfBinaryTree(root.right);
            int h = height(root.left) + height(root.right);
            return Math.max(h, Math.max(dl, dr));
        }

        int height(node root) {
            if (root == null)
                return 0;
            int hl = height(root.left);
            int hr = height(root.right);
            return Math.max(hl, hr) + 1;
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        node root = null;
        root = bt.create(root);
        int d = bt.diameterOfBinaryTree(root);
        System.out.println(d);
    }
}
