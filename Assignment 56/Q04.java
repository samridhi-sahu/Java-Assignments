public class Q04 {
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

        public void moves() {
            Node p = head;
            if (head != null) {
                while (p.next != null) {
                    p = p.next;
                }
                p.next = head;
                head = p;
            }
            while (p.next != head) {
                p = p.next;
            }
            p.next = null;
        }

        public void display() {
            Node p = head;
            if (head != null) {
                while (p != null) {
                    System.out.print(p.data + " -> ");
                    p = p.next;
                }
            }
        }
    }

    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        l.insert(3);
        l.insert(5);
        l.insert(1);
        l.insert(8);
        l.insert(7);
        l.insert(12);
        l.display();
        System.out.println("");
        l.moves();
        l.display();
    }
}
