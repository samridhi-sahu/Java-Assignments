// 2. Given a sorted doubly linked list of positive distinct elements, the task is to find pairs in a doubly-linked list whose sum is equal to given value x, without using any extra space?

class Q2 {
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

        public void pairs(int x) {
            Node p = head;
            while (p.next != null) {
                p = p.next;
            }
            Node h = head;
            while (h != p && p.next != h) {
                if (h != null && p != null) {
                    if (h.data + p.data == x) {
                        System.out.println("(" + p.data + ", " + h.data + ")");
                        h = h.next;
                        p = p.prev;
                    } else {
                        p = p.prev;
                    }
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
        list.pairs(7);
    }
}