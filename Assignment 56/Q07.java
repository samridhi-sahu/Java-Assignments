<<<<<<< HEAD
public class Q07 {
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

        public int value(int k) {
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
                while (i <= count - k) {
                    p = p.next;
                    i++;
                }
                return p.data;
            }
        }
    }

    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        l.insert(35);
        l.insert(15);
        l.insert(4);
        l.insert(20);
        int number = 4;
        int res = l.value(number);
        System.out.println("The value at the " + number + " node from the end of the Linked List is " + res);
    }
}
=======
public class Q07 {
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

        public int value(int k) {
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
                while (i <= count - k) {
                    p = p.next;
                    i++;
                }
                return p.data;
            }
        }
    }

    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        l.insert(35);
        l.insert(15);
        l.insert(4);
        l.insert(20);
        int number = 4;
        int res = l.value(number);
        System.out.println("The value at the " + number + " node from the end of the Linked List is " + res);
    }
}
>>>>>>> 4e16ffaa01296d49afa2e8e1d3f70261a4dd6dd0
