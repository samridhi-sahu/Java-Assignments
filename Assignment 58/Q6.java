// 6. Given two circular linked lists L1 and L2, the task is to find if the two circular linked lists are identical or not.

public class Q6 {
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

        public String convert() {
            String s = "";
            if (head == null) {
                return s;
            } else {
                Node p = head;
                do {
                    s += p.data;
                    p = p.next;
                } while (p != head);
                return s;
            }
        }

        public boolean find(String s1, String s2) {
            if (s1.length() != s2.length()) {
                return false;
            } else {
                s1 = s1 + s1;
                return s1.contains(s2);
            }
        }
    }

    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        linkedlist l1 = new linkedlist();
        l1.insert(5);
        l1.insert(1);
        l1.insert(8);
        l1.insert(9);
        l1.insert(0);
        l1.insert(17);
        String s1 = l1.convert();
        linkedlist l2 = new linkedlist();
        l2.insert(5);
        l2.insert(1);
        l2.insert(8);
        l2.insert(9);
        l2.insert(0);
        l2.insert(17);
        String s2 = l2.convert();
        boolean ans = l.find(s1, s2);
        System.out.print("total number of nodes are : " + ans);
    }
}
