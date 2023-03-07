import java.util.Scanner;

public class Q02 {
    static class Node {
        int data;
        Node next;

        Node() {
            next = null;
        }
    }

    static class linkedlist {
        Node head;

        public void add(int element) {
            Node n = new Node();
            n.data = element;
            n.next = null;
            if (head == null) {
                n.next = head;
                head = n;
            } else {
                Node p = new Node();
                p = head;
                while (p.next != null) {
                    p = p.next;
                }
                p.next = n;

            }
        }

        public void sorting() {
            if (head != null && head.next != null) {
                Node p = new Node();
                Node q = new Node();
                p = head;
                int temp;
                while (p != null) {
                    q = p.next;
                    while (q != null) {
                        if (p.data > q.data) {
                            temp = p.data;
                            p.data = q.data;
                            q.data = temp;
                        } else if (p.data == q.data) {
                            removeDuplicates(q);
                        }
                        q = q.next;
                    }
                    p = p.next;
                }
            }
        }

        public void removeDuplicates(Node q) {
            Node r = new Node();
            r = head;
            while (r.next != q) {
                r = r.next;
            }
            r.next = q.next;
        }

        public void display() {
            if (head != null) {
                Node p = new Node();
                p = head;
                while (p != null) {
                    System.out.print(p.data + " ");
                    p = p.next;
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedlist llist = new linkedlist();
        int i = 0;
        while (i >= 0) {
            int element = sc.nextInt();
            if (element == -1) {
                break;
            }
            llist.add(element);
            i++;
        }
        llist.sorting();
        llist.display();

    }
}
