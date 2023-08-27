// 1. Print all elements of a queue

public class q1 {

    // implementation of queue using array

    static class Queue {
        int front;
        int rare;
        int[] qarr;
        int size;

        Queue(int n) {
            size = n;
            qarr = new int[size];
            front = -1;
            rare = -1;
        }

        public void enqueue(int element) {
            if (front == (rare + 1) % size)
                System.out.println("overflow");
            else {
                if (front == -1 && rare == -1) {
                    front = 0;
                    rare = 0;
                } else {
                    rare = (rare + 1) % size;
                }
                qarr[rare] = element;
            }
        }

        public void print() {
            if (front == -1 && rare == -1)
                System.out.println("no element exist");
            else {
                for (int i = front; i <= rare; i++) {
                    System.out.print(qarr[i] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(7);
        for (int i = 1; i <= 7; i++) {
            q.enqueue(i);
        }
        q.print();
    }
}
