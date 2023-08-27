<<<<<<< HEAD
// 4. Given a circular linked list, count the number of nodes in it.
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

        public int count() {
            int count = 0;
            Node p = head;
            if (head != null) {
                while (p.next != head) {
                    count++;
                    p = p.next;
                }
                return count + 1;
            } else
                return 0;
        }

    }

    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        l.insert(5);
        l.insert(1);
        l.insert(8);
        l.insert(9);
        l.insert(0);
        l.insert(17);
        int ans = l.count();
        System.out.print("total number of nodes are : " + ans);
    }
}
=======
// 4. Given a circular linked list, count the number of nodes in it.
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

        public int count() {
            int count = 0;
            Node p = head;
            if (head != null) {
                while (p.next != head) {
                    count++;
                    p = p.next;
                }
                return count + 1;
            } else
                return 0;
        }

    }

    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        l.insert(5);
        l.insert(1);
        l.insert(8);
        l.insert(9);
        l.insert(0);
        l.insert(17);
        int ans = l.count();
        System.out.print("total number of nodes are : " + ans);
    }
}
>>>>>>> 4e16ffaa01296d49afa2e8e1d3f70261a4dd6dd0
