// 2. Create a stack of int type, and find the top most element in a stack.
public class q2 {
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
                return;
            else {
                arr[++top] = element;
            }
        }

        public int Top() {
            return arr[top];
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(4);
        stack.push(2);
        stack.push(9);
        stack.push(8);
        stack.push(6);
        int top = stack.Top();
        System.out.print(top);
    }
}
