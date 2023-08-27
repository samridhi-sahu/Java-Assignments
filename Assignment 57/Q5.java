<<<<<<< HEAD
// 5. Given an unsorted doubly linked list containing n nodes. The problem is to remove duplicate nodes from the given list.

public class Q5 {
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

        public void remove() {
            Node p = head;
            while (p != null) {
                Node q = p.next;
                while (q != null) {
                    if (p.data != q.data) {
                        q = q.next;
                    } else {
                        q.prev.next = q.next;
                        if (q.next != null) {
                            q.next.prev = q.prev;
                        }
                        q = q.next;
                    }
                }
                p = p.next;
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
        list.insert(3);
        list.insert(2);
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(5);
        list.insert(4);
        list.insert(4);
        list.insert(5);
        list.remove();
        list.display();
    }
}
=======
// 5. Given an unsorted doubly linked list containing n nodes. The problem is to remove duplicate nodes from the given list.

public class Q5 {
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

        public void remove() {
            Node p = head;
            while (p != null) {
                Node q = p.next;
                while (q != null) {
                    if (p.data != q.data) {
                        q = q.next;
                    } else {
                        q.prev.next = q.next;
                        if (q.next != null) {
                            q.next.prev = q.prev;
                        }
                        q = q.next;
                    }
                }
                p = p.next;
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
        list.insert(3);
        list.insert(2);
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(5);
        list.insert(4);
        list.insert(4);
        list.insert(5);
        list.remove();
        list.display();
    }
}
>>>>>>> 4e16ffaa01296d49afa2e8e1d3f70261a4dd6dd0
