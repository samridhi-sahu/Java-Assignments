// 4. Reverse the Words of a String using Stack.
public class q4 {
    static class Stack {
        int top;
        int size;
        String[] arr;

        Stack(int n) {
            size = n;
            arr = new String[size];
            top = -1;
        }

        public void push(String element) {
            if (top >= size - 1)
                System.out.println("Element can not be insertrd, stack is full");
            else {
                arr[++top] = element;
            }
        }

        public void display() {
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        String str = "I am proud to be an Indian";
        String[] array = str.split(" ");
        Stack stack = new Stack(array.length);
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        stack.display();
    }
}
