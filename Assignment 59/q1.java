// 1. Create a Queue using Array
public class q1 {
    static class Queue {
        int[] q;
        int size;
        int front;
        int rare;

        Queue(int n) {
            front = -1;
            rare = -1;
            size = n;
            q = new int[size];
        }

        public void enqueue(int element) {
            if (front == (rare + 1) % size) {
                System.out.println("overflow");
            } else {
                if (front == -1 && rare == -1) {
                    front = 0;
                    rare = 0;
                } else {
                    rare = (rare + 1) % size;
                }
                q[rare] = element;
            }
        }

        public void display() {
            for (int i = front; i <= rare; i++) {
                System.out.print(q[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Queue myq = new Queue(5);
        myq.enqueue(3);
        myq.enqueue(35);
        myq.enqueue(23);
        myq.enqueue(15);
        myq.enqueue(43);
        myq.display();
    }
}
