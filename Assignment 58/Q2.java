// 2. Given a sorted circular doubly linked list of distinct nodes(no two nodes have the same data) and a value x. Count triplets in the list that sum up to a given value x.
public class Q2 {
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

        public int triplet(int element) {
            int count = 0;
            Node p = head;
            while (p.next.next != head) {
                Node q = p.next;
                while (q.next != head) {
                    Node r = q.next;
                    while (r != head) {
                        int sum = p.data + q.data + r.data;
                        if (sum == element) {
                            count++;
                            System.out.println("elements of triplet are : " + p.data + " " + q.data + " " + r.data);
                        }
                        r = r.next;
                    }
                    q = q.next;
                }
                p = p.next;
            }
            return count;
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
        l.insert(2);
        int ans = l.triplet(9);
        System.out.print("total number of Triplet are : ");
        System.out.println(ans);
    }
}
