
// 2. Write a function to find the smallest number from the given array of any size. (TSRS)
import java.util.*;

public class A15Q02 {
    public static int min(int[] arr) {
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (smallest >= arr[i]) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = min(arr);
        System.out.println(ans);
    }
}
