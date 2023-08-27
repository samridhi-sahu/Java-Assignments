<<<<<<< HEAD
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
=======
// 1. Write a program to print 3rd level all node in a tree
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
        Node root;

        public void create() {
            root = new Node(1);
            root.lc = new Node(2);
            root.rc = new Node(3);
            root.lc.lc = new Node(4);
            root.lc.rc = new Node(5);
            root.rc.lc = new Node(6);
            root.rc.rc = new Node(7);
            root.lc.lc.lc = new Node(8);
            root.lc.lc.rc = new Node(9);
            root.lc.rc.lc = new Node(10);
            root.lc.rc.rc = new Node(11);
            root.rc.lc.lc = new Node(12);
            root.rc.lc.rc = new Node(13);
            root.rc.rc.lc = new Node(14);
            root.rc.rc.rc = new Node(15);
        }

        public void levelnodes(Node p, int level) {
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
        bt.create();
        bt.levelnodes(bt.root, 3 - 1);
    }
}
>>>>>>> 4e16ffaa01296d49afa2e8e1d3f70261a4dd6dd0
