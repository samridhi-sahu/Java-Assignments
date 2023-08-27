<<<<<<< HEAD
// 2. Create a Queue using a linked list.
public class q2 {
    static class Node {
        int data;
        Node next;

        Node() {
            next = null;
        }
    }

    static class Queue {
        Node front;
        Node rear;

        Queue() {
            rear = null;
            front = null;
        }

        public void enqueue(int element) {
            Node n = new Node();
            n.data = element;
            if (front == null && rear == null) {
                front = n;
                rear = n;
            } else {
                rear.next = n;
                rear = n;
            }
        }

        public void display() {
            Node p = front;
            while (p != null) {
                System.out.print(p.data + " ");
                p = p.next;
            }
        }
    }

    public static void main(String[] args) {
        Queue myq = new Queue();
        myq.enqueue(3);
        myq.enqueue(35);
        myq.enqueue(23);
        myq.enqueue(15);
        myq.enqueue(43);
        myq.display();
    }
}
=======
// 2. Create a Queue using a linked list.
public class q2 {
    static class Node {
        int data;
        Node next;

        Node() {
            next = null;
        }
    }

    static class Queue {
        Node front;
        Node rear;

        Queue() {
            rear = null;
            front = null;
        }

        public void enqueue(int element) {
            Node n = new Node();
            n.data = element;
            if (front == null && rear == null) {
                front = n;
                rear = n;
            } else {
                rear.next = n;
                rear = n;
            }
        }

        public void display() {
            Node p = front;
            while (p != null) {
                System.out.print(p.data + " ");
                p = p.next;
            }
        }
    }

    public static void main(String[] args) {
        Queue myq = new Queue();
        myq.enqueue(3);
        myq.enqueue(35);
        myq.enqueue(23);
        myq.enqueue(15);
        myq.enqueue(43);
        myq.display();
    }
}
>>>>>>> 4e16ffaa01296d49afa2e8e1d3f70261a4dd6dd0
