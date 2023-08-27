// 7. Given a doubly-linked list, rotate the linked list counter-clockwise by N nodes. Here N is a given positive integer and is smaller than the count of nodes in the linked list.

public class Q7 {
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
            n.prev = null;
            n.next = null;
            if (head == null) {
                head = n;
            } else {
                Node p = head;
                while (p.next != null) {
                    p = p.next;
                }
                p.next = n;
                n.prev = p;
            }
        }

        public void rotate(int x) {
            Node p = head;
            while (p.next != null) {
                p = p.next;
            }
            Node q = head;
            int i = 0;
            while (i < x) {
                Node n = new Node();
                n.data = p.data;
                n.next = q;
                if (q == head) {
                    n.prev = null;
                    head.prev = n;
                    head = n;
                } else {
                    n.prev = q.prev;
                    q.prev.next = n;
                    q.prev = n;
                }
                p.prev.next = null;
                p = p.prev;
                i++;
            }
        }

        public void display() {
            Node p = head;
            while (p != null) {
                System.out.print(p.data + " ");
                p = p.next;
            }
        }
    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);
        list.insert(9);
        list.insert(10);
        System.out.println("Before rotating the given list, elements are : ");
        list.display();
        list.rotate(5);
        System.out.println("\nAfter rotating the given list, elements are : ");
        list.display();
    }
}
