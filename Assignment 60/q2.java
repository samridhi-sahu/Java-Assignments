// 2. Write a program to search element in a BST
public class q2 {
    static class Node {
        int data;
        Node leftchild;
        Node rightchild;

        Node() {
            leftchild = null;
            rightchild = null;
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
                        if (p.leftchild == null) {
                            p.leftchild = n;
                            return;
                        }
                        p = p.leftchild;
                    }
                    if (element >= p.data) {
                        if (p.rightchild == null) {
                            p.rightchild = n;
                            return;
                        }
                        p = p.rightchild;
                    }
                }
            }
        }

        public Node search(Node p, int element) {
            if (p == null)
                return null;
            if (p.data == element) {
                System.out.print("yes element found in given tree");
                return p;
            }
            if (p.data > element)
                return search(p.leftchild, element);
            else
                return search(p.rightchild, element);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.create(10);
        bst.create(9);
        bst.create(11);
        bst.create(13);
        bst.create(8);
        bst.create(6);
        bst.create(5);
        bst.create(1);
        bst.create(7);
        bst.search(bst.root, 9);
    }
}
