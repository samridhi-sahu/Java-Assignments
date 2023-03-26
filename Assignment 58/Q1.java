// 1. Given a circular doubly linked list and a position n. The task is to delete the node at the given position n from the beginning. Initial circular doubly linked list.

class Q1 {
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

        public void remove(int n) {
            Node p = head;
            int i = 0;
            while (i < n) {
                p = p.next;
                i++;
            }
            p.prev.next = p.next;
            p.next.prev = p.prev;
            if (n == 0) {
                head = p.next;
            }
        }

        public void display() {
            Node p = head;
            if (head != null) {
                while (p.next != head || p != head) {
                    System.out.print(p.data + " ");
                    p = p.next;
                    if (p == head) {
                        break;
                    }
                }
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
        System.out.println("Before removing, Elements are : ");
        l.display();
        l.remove(3);
        System.out.println("\nAfter removing, Elements are : ");
        l.display();
    }
}