<<<<<<< HEAD
// 3. Given a sorted doubly linked list and a value to insert, write a function to insert the value in a sorted way.

public class Q3 {
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

        public void add(int x) {
            Node n = new Node();
            n.data = x;
            Node p = head;
            while (p.next != null) {
                if (p.data <= n.data) {
                    p = p.next;
                } else {
                    p.prev.next = n;
                    n.prev = p.prev;
                    p.prev = n;
                    n.next = p;
                    break;
                }
            }
        }

        public void display() {
            if (head != null) {
                Node p = head;
                while (p != null) {
                    System.out.print(p.data + " ");
                    p = p.next;
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
        System.out.print("List Elements before adding : ");
        list.display();
        System.out.println();
        list.add(3);
        list.add(7);
        System.out.print("List Elements after adding : ");
        list.display();
    }
}
=======
// 3. Given a sorted doubly linked list and a value to insert, write a function to insert the value in a sorted way.

public class Q3 {
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

        public void add(int x) {
            Node n = new Node();
            n.data = x;
            Node p = head;
            while (p.next != null) {
                if (p.data <= n.data) {
                    p = p.next;
                } else {
                    p.prev.next = n;
                    n.prev = p.prev;
                    p.prev = n;
                    n.next = p;
                    break;
                }
            }
        }

        public void display() {
            if (head != null) {
                Node p = head;
                while (p != null) {
                    System.out.print(p.data + " ");
                    p = p.next;
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
        System.out.print("List Elements before adding : ");
        list.display();
        System.out.println();
        list.add(3);
        list.add(7);
        System.out.print("List Elements after adding : ");
        list.display();
    }
}
>>>>>>> 4e16ffaa01296d49afa2e8e1d3f70261a4dd6dd0
