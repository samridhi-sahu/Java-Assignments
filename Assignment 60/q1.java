// 1. Write a program to print 3rd level all node in a tree

import java.util.Scanner;

public class q1 {
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

        public void levelnodes(Node root, int level) {
            Node p = root;
            for (int i = 0; i < level - 1; i++) {
                p = p.lc;
            }
            System.out.print(p.lc.data + " " + p.rc.data + " ");
            p = root;
            for (int i = 0; i < level - 1; i++) {
                p = p.rc;
            }
            System.out.print(p.lc.data + " " + p.rc.data);
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Node root = null;
        root = bt.create(root);
        bt.levelnodes(root, 3 - 1);
    }
}
