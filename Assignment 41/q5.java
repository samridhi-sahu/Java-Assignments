// 6. Reverse a string using a stack.
public class q5 {
    static class Stack {
        int top;
        int size;
        char[] arr;

        Stack(int n) {
            size = n;
            arr = new char[size];
            top = -1;
        }

        public void push(char element) {
            if (top >= size - 1)
                System.out.println("Element can not be insertrd, stack is full");
            else {
                arr[++top] = element;
            }
        }

        public void display() {
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        String str = "Reverse String";
        System.out.println("Input String is : " + str);
        Stack stack = new Stack(str.length());
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        System.out.print("Reverse String is : ");
        stack.display();
    }
}
