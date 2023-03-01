
// 3. Write a function to sort an array of any size.

import java.util.*;

public class A15Q03 {
    public static int[] asc(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                temp = arr[j];
                if (arr[j] >= arr[j + 1]) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] dsc(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                temp = arr[j];
                if (arr[j] <= arr[j + 1]) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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
        int[] ans1 = asc(arr);
        System.out.println(Arrays.toString(ans1));
        int[] ans2 = dsc(arr);
        System.out.println(Arrays.toString(ans2));

    }
}
