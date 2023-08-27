<<<<<<< HEAD
public class Q10 {
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

        public int value() {
            int count = 0;
            Node p = head;
            if (head == null) {
                return 0;
            } else {
                while (p != null) {
                    count++;
                    p = p.next;
                }
                p = head;
                int i = 1;
                while (i <= count / 2) {
                    p = p.next;
                    i++;
                }
                return p.data;
            }
        }
    }

    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.insert(5);
        l.insert(6);
        int res = l.value();
        System.out.println("The value at the middile node of the Linked List is " + res);
    }
}
=======
public class Q10 {
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

        public int value() {
            int count = 0;
            Node p = head;
            if (head == null) {
                return 0;
            } else {
                while (p != null) {
                    count++;
                    p = p.next;
                }
                p = head;
                int i = 1;
                while (i <= count / 2) {
                    p = p.next;
                    i++;
                }
                return p.data;
            }
        }
    }

    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.insert(5);
        l.insert(6);
        int res = l.value();
        System.out.println("The value at the middile node of the Linked List is " + res);
    }
}
>>>>>>> 4e16ffaa01296d49afa2e8e1d3f70261a4dd6dd0
