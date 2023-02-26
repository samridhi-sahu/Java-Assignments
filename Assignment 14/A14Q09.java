
// 9. Write a program in C to copy the elements of one array into another array.Take array values from the user.
import java.util.*;

public class A14Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[10];
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < 10; i++) {
            arr1[i] = sc.nextInt();
        }
        arr2 = arr1.clone();
        System.out.println(Arrays.toString(arr2));
    }
}
