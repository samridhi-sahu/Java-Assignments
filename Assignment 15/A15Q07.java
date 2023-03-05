
// 7. Write a function to count a total number of duplicate elements in an array.
import java.util.*;

public class A15Q07 {

    public static int func(int[] arr) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (i > 0 && arr[i] == arr[i - 1]) {

            } else {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
            }
            if (count > 1) {
                x++;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int res = func(arr);
        System.out.println(res);
    }
}
