// 3. Create a stack, and implement main operations like push(), pop(), peek(), empty() and size().
public class q3 {
    static class Stack {
        int top;
        int size;
        int[] arr;

        Stack(int n) {
            size = n;
            arr = new int[size];
            top = -1;
        }

        public void push(int element) {
            if (top >= size - 1)
                System.out.println("Stack is full");
            else {
                arr[++top] = element;
                System.out.println("Inserted element is : " + arr[top]);
            }
        }

        public void pop() {
            if (top < 0)
                System.out.println("Stack is empty");
            else {
                int item = arr[top--];
                System.out.println("Deleted element is : " + item);
            }
        }

        public int peek() {
            if (top < 0)
                return -1;
            else
                return arr[top];
        }

        public boolean isEmpty() {
            return top < 0;
        }

        public int size() {
            return top + 1;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        System.out.println(stack.isEmpty());
        stack.push(2);
        stack.push(9);
        stack.push(8);
        System.out.println(stack.peek());
        stack.push(6);
        stack.push(1);
        stack.pop();
        stack.push(5);
        stack.push(4);
        stack.push(0);
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        stack.push(4);
        stack.push(9);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
    }
}
