<<<<<<< HEAD
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
=======
// 3. Write a program to print elements of a tree at a given level using recursion.
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
        bt.create();
        bt.levelnodes(bt.root, 3 - 1);
    }
}
>>>>>>> 4e16ffaa01296d49afa2e8e1d3f70261a4dd6dd0
