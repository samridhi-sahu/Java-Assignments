// 8. Write a program to find the height of a tree.

import java.util.Scanner;

public class q8 {
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

        int height(node root) {
            if (root == null)
                return -1;
            int hl = height(root.left);
            int hr = height(root.right);
            if (hl > hr)
                return hl + 1;
            else
                return hr + 1;
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        node root = null;
        root = bt.create(root);
        int h = bt.height(root);
        System.out.println(h + 1);
    }
}
