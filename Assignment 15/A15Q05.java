
// 5. Write a function to read n number of values in an array and display it in reverse order.
import java.util.*;

public class A15Q05 {
    public static int[] newarray(int[] arr, int n) {
        for (int j = n - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int[] ans = newarray(arr, n);
    }
}
