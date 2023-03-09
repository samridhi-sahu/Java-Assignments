public class Q06 {
    static class Node {
        int data;
        Node next;

        Node() {
            next = null;
        }
    }

    static class linkedlist {
        Node head;

        public void insert(int element) {
            Node n = new Node();
            n.data = element;
            n.next = null;
            if (head == null) {
                n.next = head;
                head = n;
            } else {
                Node p = head;
                while (p.next != null) {
                    p = p.next;
                }
                p.next = n;
            }
        }

        public int count(int k) {
            int x = 0;
            Node p = head;
            if (head == null) {
                return 0;
            } else {
                while (p != null) {
                    if (p.data == k) {
                        x++;
                    }
                    p = p.next;
                }
                return x;
            }
        }
    }

    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        l.insert(1);
        l.insert(2);
        l.insert(1);
        l.insert(2);
        l.insert(1);
        l.insert(3);
        l.insert(1);
        int key = 1;
        int res = l.count(key);
        System.out.println("occurrences of the given key " + key + " in the linked list are " + res);
    }
}
