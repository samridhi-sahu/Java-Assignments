
// 6. Write a program to sort elements of an array of size 10. Take array values from the user.
import java.util.*;

public class A14Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        int temp;

        // sorting in increasing order
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                temp = arr[j];
                if (arr[j] >= arr[j + 1]) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("sorted elements of an array in asc order are : ");
        System.out.println(Arrays.toString(arr));

        // sorting in decreasing order
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                temp = arr[j];
                if (arr[j] <= arr[j + 1]) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("sorted elements of an array in dsc order are : ");
        System.out.println(Arrays.toString(arr));

    }
}