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
