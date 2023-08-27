// 1. Create a stack of int type, push 5 elements in it and print it on the console screen.
public class q1 {
    static class Stack {
        int top;
        int[] arr = new int[5];

        Stack() {
            top = -1;
        }

        public void push(int element) {
            if (top >= 4)
                System.out.println("Element can not be insertrd, stack is full");
            else {
                arr[++top] = element;
            }
        }

        public void display() {
            System.out.println("Element are : ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(3);
        stack.push(7);
        stack.push(5);
        stack.push(2);
        stack.push(6);
        stack.display();
    }
}
