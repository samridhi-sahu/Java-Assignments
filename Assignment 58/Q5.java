// 5. Given a doubly linked list, we have to convert it into a circular linked list.

public class Q5 {
    static class Node {
        int data;
        Node prev;
        Node next;

        Node() {
            prev = null;
            next = null;
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
                n.prev = head;
                n.next = head;
                head = n;
            } else {
                Node p = head;
                while (p.next != null) {
                    p = p.next;
                }
                n.prev = p;
                p.next = n;
            }
        }

        public void convert() {
            Node p = head;
            if (head != null) {
                while (p.next != null) {
                    p = p.next;
                }
                p.next = head;
                p.next.prev = p;
                if (p.next.data == head.data) {
                    System.out.println(
                            "Conversion from doubly linked list to a circular linked list is done successfully");
                } else {
                    System.out.println(
                            "Conversion from doubly linked list to a circular linked list is failed");
                }
            }
        }
    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.insert(1);
        list.insert(2);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(8);
        list.insert(9);
        list.insert(11);
        list.convert();
    }
}
