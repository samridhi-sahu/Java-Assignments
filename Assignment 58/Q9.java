// 9. Given a circular doubly linked list containing n nodes. The problem is to reverse every group of k nodes in the list.

public class Q9 {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node() {
            next = null;
            prev = null;
        }
    }

    static class linkedlist {
        Node head;

        public void insert(int element) {
            Node n = new Node();
            n.data = element;
            n.next = null;
            n.prev = null;
            if (head == null) {
                head = n;
                n.next = head;
            } else {
                Node p = head;
                while (p.next != head) {
                    p = p.next;
                }
                p.next = n;
                n.prev = p;
                n.next = head;
                head.prev = n;
            }
        }

        public void reverse(int n, int k) {
            Node p = head;
            Node q = head;
            for (int j = 0; j < n - 2; j++) {
                int i = 1;
                while (i < k) {
                    p = p.next;
                    i++;
                }
                while (p != q) {
                    int temp = p.data;
                    p.data = q.data;
                    q.data = temp;
                    q = q.next;
                    p = p.prev;
                }
            }
        }

        public void display() {
            Node p = head;
            if (head != null) {
                do {
                    System.out.print(p.data + " ");
                    p = p.next;
                } while (p != head);
            }
        }
    }

    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        l.insert(5);
        l.insert(1);
        l.insert(8);
        l.insert(19);
        l.insert(53);
        l.insert(34);
        l.insert(2);
        int n = 6;
        int k = 2;
        System.out.println("Before reversing, Elements are : ");
        l.display();
        l.reverse(n, k);
        System.out.println("\nAfter reversing, Elements are : ");
        l.display();
    }
}
