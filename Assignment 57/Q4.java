<<<<<<< HEAD
// 4. Given a sorted doubly linked list containing n nodes. The problem is removing duplicate nodes from the given list.

public class Q4 {
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

        public void remove_element() {
            Node p = head.next;
            while (p != null) {
                if (p.next != null && p.data == p.next.data) {
                    if (p.next.next == null) {
                        p.next = null;
                    } else {
                        p.next = p.next.next;
                        p.next.prev = p;
                    }
                } else {
                    p = p.next;
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
        list.insert(2);
        list.insert(3);
        list.insert(3);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        System.out.print("List Elements before removing : ");
        list.display();
        System.out.println();
        list.remove_element();
        System.out.print("List Elements after removing : ");
        list.display();
    }
}
=======
// 4. Given a sorted doubly linked list containing n nodes. The problem is removing duplicate nodes from the given list.

public class Q4 {
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

        public void remove_element() {
            Node p = head.next;
            while (p != null) {
                if (p.next != null && p.data == p.next.data) {
                    if (p.next.next == null) {
                        p.next = null;
                    } else {
                        p.next = p.next.next;
                        p.next.prev = p;
                    }
                } else {
                    p = p.next;
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
        list.insert(2);
        list.insert(3);
        list.insert(3);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        System.out.print("List Elements before removing : ");
        list.display();
        System.out.println();
        list.remove_element();
        System.out.print("List Elements after removing : ");
        list.display();
    }
}
>>>>>>> 4e16ffaa01296d49afa2e8e1d3f70261a4dd6dd0
