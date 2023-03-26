// 7. Given a circular singly linked list containing N nodes, the task is to delete all the odd nodes from the list.

public class Q7 {
    static class node {
        int data;
        node next;

        node() {
            next = null;
        }
    }

    static class linkedlist {
        node head;

        public void insert(int element) {
            node n = new node();
            n.data = element;
            n.next = null;
            if (head == null) {
                head = n;
                n.next = head;
            } else {
                node p = head;
                while (p.next != head) {
                    p = p.next;
                }
                p.next = n;
                n.next = head;
            }
        }

        public void remove(int n) {
            node p = head;
            node q = p;
            int i = 0;
            do {
                p = p.next;
                if (p == head) {
                    break;
                }
                q.next = p.next;
                q = q.next;
                p = p.next;
                i++;
            } while (p != head && i < n);
        }

        public void display() {
            node p = head;
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
        System.out.println("Before removing, Elements are : ");
        l.display();
        l.remove(6);
        System.out.println("\nAfter removing, Elements are : ");
        l.display();
    }
}
