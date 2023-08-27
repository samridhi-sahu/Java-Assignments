
// 10. Write a function in C to count the frequency of each element of an array.
import java.util.Scanner;

public class A15Q10 {
    public static void func(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    count++;
                }
            }
            if (i > 0 && arr[i] == arr[i - 1]) {

            } else {
                System.out.println("Element " + arr[i] + " came " + count + " times in the array");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        func(arr);
    }
}
