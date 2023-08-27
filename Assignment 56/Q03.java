
public class Q03 {
    static class Node {
        String data;
        Node next;

        Node() {
            next = null;
        }
    }

    static class LinkedList {
        Node head;

        public void insert(String element) {
            Node n = new Node();
            n.data = element;
            n.next = null;
            if (head == null) {
                n.next = null;
                head = n;
            } else {
                Node p = head;
                while (p.next != null) {
                    p = p.next;
                }
                p.next = n;
            }
        }

        public void swap() {
            Node p = head;
            while (p.next != null) {
                if (p.next.data == null) {
                    break;
                } else {
                    String temp = p.data;
                    p.data = p.next.data;
                    p.next.data = temp;
                    p = p.next.next;
                }
            }

        }

        public void display() {
            Node p = head;
            while (p != null) {
                System.out.print(p.data + " -> ");
                p = p.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.insert("1");
        llist.insert("2");
        llist.insert("3");
        llist.insert("4");
        llist.insert("5");
        llist.insert(null);
        llist.swap();
        llist.display();
    }
}
