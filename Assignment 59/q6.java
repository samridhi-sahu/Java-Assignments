<<<<<<< HEAD
// 6. Implementation ofront Deque using doubly linked list
public class q6 {
    static class Node {
        int data;
        Node prev;
        Node next;

        Node() {
            prev = null;
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
                n.prev = rear;
                rear = n;
            }
        }

        public void dequeue() {
            if (front == null) {
                System.out.println("empty list");
            } else {
                front = front.next;
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
        System.out.print("Before performing dequeue operation list is : ");
        myq.display();
        myq.dequeue();
        myq.dequeue();
        System.out.print("\nAfter performing dequeue operation list is : ");
        myq.display();
    }
}
=======
// 6. Implementation ofront Deque using doubly linked list
public class q6 {
    static class Node {
        int data;
        Node prev;
        Node next;

        Node() {
            prev = null;
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
                n.prev = rear;
                rear = n;
            }
        }

        public void dequeue() {
            if (front == null) {
                System.out.println("empty list");
            } else {
                front = front.next;
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
        System.out.print("Before performing dequeue operation list is : ");
        myq.display();
        myq.dequeue();
        myq.dequeue();
        System.out.print("\nAfter performing dequeue operation list is : ");
        myq.display();
    }
}
>>>>>>> 4e16ffaa01296d49afa2e8e1d3f70261a4dd6dd0
