// 5. Write a program to find the maximum element in a BST.
public class q5 {
    static class Node {
        int data;
        Node lc, rc;

        Node() {
            lc = rc = null;
        }
    }

    static class BinarySearchTree {
        Node root;

        public void create(int element) {
            Node n = new Node();
            n.data = element;
            if (root == null) {
                root = n;
            } else {
                Node p = root;
                while (p != null) {
                    if (element < p.data) {
                        if (p.lc == null) {
                            p.lc = n;
                            return;
                        } else {
                            p = p.lc;
                        }
                    }
                    if (element >= p.data) {
                        if (p.rc == null) {
                            p.rc = n;
                            return;
                        } else {
                            p = p.rc;
                        }
                    }
                }
            }
        }

        public int maximum() {
            Node p = root;
            while (p.rc != null) {
                p = p.rc;
            }
            return p.data;
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.create(10);
        bst.create(9);
        bst.create(97);
        bst.create(13);
        bst.create(8);
        bst.create(6);
        bst.create(5);
        bst.create(1);
        bst.create(7);
        int ans = bst.maximum();
        System.out.println(ans);
    }
}
