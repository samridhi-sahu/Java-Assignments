<<<<<<< HEAD
public class Q09 {
    static class Node {
        char data;
        Node next;

        Node() {
            next = null;
        }
    }

    static class linkedlist {
        Node head;

        public void insert(char element) {
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

        public boolean palindrome() {
            Node t = head;
            int len = 0;
            if (head != null) {
                while (t != null) {
                    len++;
                    t = t.next;
                }
            }
            t = head;
            int count = 0;
            for (int i = len; t != null && i > 0; i--) {
                Node p = head;
                int j = 1;
                while (j < i) {
                    p = p.next;
                    j++;
                }
                if (t.data == p.data) {
                    t = t.next;
                    count++;
                    continue;
                } else {
                    break;
                }
            }
            if (count == len)
                return true;
            else
                return false;
        }
    }

    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        l.insert('a');
        l.insert('b');
        l.insert('c');
        l.insert('c');
        l.insert('b');
        l.insert('a');
        boolean res = l.palindrome();
        System.out.println("The given Linked List is palindrome : " + res);
    }
}
=======
public class Q09 {
    static class Node {
        char data;
        Node next;

        Node() {
            next = null;
        }
    }

    static class linkedlist {
        Node head;

        public void insert(char element) {
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

        public boolean palindrome() {
            Node t = head;
            int len = 0;
            if (head != null) {
                while (t != null) {
                    len++;
                    t = t.next;
                }
            }
            t = head;
            int count = 0;
            for (int i = len; t != null && i > 0; i--) {
                Node p = head;
                int j = 1;
                while (j < i) {
                    p = p.next;
                    j++;
                }
                if (t.data == p.data) {
                    t = t.next;
                    count++;
                    continue;
                } else {
                    break;
                }
            }
            if (count == len)
                return true;
            else
                return false;
        }
    }

    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        l.insert('a');
        l.insert('b');
        l.insert('c');
        l.insert('c');
        l.insert('b');
        l.insert('a');
        boolean res = l.palindrome();
        System.out.println("The given Linked List is palindrome : " + res);
    }
}
>>>>>>> 4e16ffaa01296d49afa2e8e1d3f70261a4dd6dd0
