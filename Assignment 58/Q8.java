<<<<<<< HEAD
// 8. Given a circular doubly-linked list, find the largest node in the doubly linked list.

public class Q8 {
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
                n.next.prev = n;
            }
        }

        public int largest() {
            Node p = head;
            int temp = 0;
            if (head != null) {
                temp = p.data;
                do {
                    p = p.next;
                    if (temp < p.data) {
                        temp = p.data;
                    }
                } while (p != head);
            }
            return temp;
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
        int ans = l.largest();
        System.out.println("Largest element is : " + ans);
    }
}
=======
// 8. Given a circular doubly-linked list, find the largest node in the doubly linked list.

public class Q8 {
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
                n.next.prev = n;
            }
        }

        public int largest() {
            Node p = head;
            int temp = 0;
            if (head != null) {
                temp = p.data;
                do {
                    p = p.next;
                    if (temp < p.data) {
                        temp = p.data;
                    }
                } while (p != head);
            }
            return temp;
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
        int ans = l.largest();
        System.out.println("Largest element is : " + ans);
    }
}
>>>>>>> 4e16ffaa01296d49afa2e8e1d3f70261a4dd6dd0
