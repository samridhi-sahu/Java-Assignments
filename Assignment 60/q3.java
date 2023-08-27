// 3. Write a program to print elements of a tree at a given level using recursion.

import java.util.Scanner;

public class q3 {
    static class Node {
        int data;
        Node lc;
        Node rc;

        Node(int element) {
            data = element;
            lc = null;
            rc = null;
        }
    }

    static class BinaryTree {
        Scanner sc = new Scanner(System.in);

        public Node create(Node root) {
            int data = sc.nextInt();
            root = new Node(data);
            if (data == -1)
                return null;
            System.out.println("enter lc data " + data);
            root.lc = create(root.lc);
            System.out.println("enter rc data " + data);
            root.rc = create(root.rc);
            return root;
        }

        public void levelnodes(Node p, int level) {
            if (level == 0)
                System.out.print(p.data + " ");
            else if (level > 0) {
                levelnodes(p.lc, level - 1);
                levelnodes(p.rc, level - 1);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Node root = null;
        root = bt.create(root);
        bt.levelnodes(root, 3 - 1);
    }
}
