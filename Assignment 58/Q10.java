// 10. Write a program to reverse the given circular Doubly Linked List.
public class Q10 {
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
            n.next = null;
            n.prev = null;
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
                head.prev = n;
            }
        }

        public void reverse() {
            Node p = head;
            while (p.next != head) {
                p = p.next;
            }
            Node q = head;
            while (p != q) {
                int temp = p.data;
                p.data = q.data;
                q.data = temp;
                q = q.next;
                p = p.prev;
                if (p.next == q) {
                    break;
                }
            }
        }

        public void display() {
            Node p = head;
            if (head != null) {
                do {
                    System.out.print(p.data + " ");
                    p = p.next;
                } while (p != head);
            }
        }
    }

    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        l.insert(5);
        l.insert(1);
        l.insert(8);
        l.insert(19);
        l.insert(53);
        l.insert(34);
        l.insert(2);
        System.out.println("Before reversing, Elements are : ");
        l.display();
        l.reverse();
        System.out.println("\nAfter reversing, Elements are : ");
        l.display();
    }
}
