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
            n.prev = null;
            n.next = null;
            if (head == null) {
                head = n;
            } else {
                Node p = head;
                while (p.next != null) {
                    p = p.next;
                }
                p.next = n;
                n.prev = p;
            }
        }

        public void removing() {
            Node p = head;
            while (p.next != null) {
                int temp = p.data;
                int temp1 = (int) Math.sqrt(5 * temp * temp + 4);
                int temp2 = (int) Math.sqrt(5 * temp * temp - 4);
                if (temp1 * temp1 == 5 * temp * temp + 4 || temp2 * temp2 == 5 * temp * temp - 4) {
                    p.prev.next = p.next;
                    p.next.prev = p.prev;
                }
                p = p.next;
            }
        }

        public void display() {
            Node p = head;
            while (p != null) {
                System.out.print(p.data + " ");
                p = p.next;
            }
        }
    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.insert(15);
        list.insert(13);
        list.insert(16);
        list.insert(8);
        list.insert(7);
        System.out.println("Before Removing, elements are : ");
        list.display();
        list.removing();
        System.out.println("\nAfter Removing, elements are : ");
        list.display();
    }
}
