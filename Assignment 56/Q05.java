<<<<<<< HEAD
public class Q05 {
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

        public void addcycle() {
            Node p = head;
            if (head == null) {
                System.out.println("no cycle");
            } else {
                while (p.next != null) {
                    p = p.next;
                }
                p.next = head.next.next;
            }
        }

        public Boolean checkingloop() {
            Node f = head;
            Node s = head;
            while (f != null && f.next != null) {
                f = f.next.next;
                s = s.next;
                if (f == s) {
                    return true;
                }
            }
            return false;
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
        l.insert(7);
        l.insert(8);
        l.addcycle();
        boolean ans = l.checkingloop();
        System.out.println("Loop exist in the given linked list : " + ans);
    }
}
=======
public class Q05 {
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

        public void addcycle() {
            Node p = head;
            if (head == null) {
                System.out.println("no cycle");
            } else {
                while (p.next != null) {
                    p = p.next;
                }
                p.next = head.next.next;
            }
        }

        public Boolean checkingloop() {
            Node f = head;
            Node s = head;
            while (f != null && f.next != null) {
                f = f.next.next;
                s = s.next;
                if (f == s) {
                    return true;
                }
            }
            return false;
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
        l.insert(7);
        l.insert(8);
        l.addcycle();
        boolean ans = l.checkingloop();
        System.out.println("Loop exist in the given linked list : " + ans);
    }
}
>>>>>>> 4e16ffaa01296d49afa2e8e1d3f70261a4dd6dd0
