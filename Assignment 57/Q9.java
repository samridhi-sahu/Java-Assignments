<<<<<<< HEAD
// 9. Given a Doubly linked list containing N nodes, the task is to remove all the nodes from the list which contains elements whose digit sum is even.

public class Q9 {
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
                int sum = 0;
                while (temp > 0) {
                    sum += temp % 10;
                    temp = temp / 10;
                }
                if (sum % 2 == 0) {
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
        list.insert(18);
        list.insert(15);
        list.insert(8);
        list.insert(14);
        list.insert(9);
        System.out.println("Before Removing, elements are : ");
        list.display();
        list.removing();
        System.out.println("\nAfter Removing, elements are : ");
        list.display();
    }
}
=======
// 9. Given a Doubly linked list containing N nodes, the task is to remove all the nodes from the list which contains elements whose digit sum is even.

public class Q9 {
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
                int sum = 0;
                while (temp > 0) {
                    sum += temp % 10;
                    temp = temp / 10;
                }
                if (sum % 2 == 0) {
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
        list.insert(18);
        list.insert(15);
        list.insert(8);
        list.insert(14);
        list.insert(9);
        System.out.println("Before Removing, elements are : ");
        list.display();
        list.removing();
        System.out.println("\nAfter Removing, elements are : ");
        list.display();
    }
}
>>>>>>> 4e16ffaa01296d49afa2e8e1d3f70261a4dd6dd0
