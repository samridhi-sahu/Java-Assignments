<<<<<<< HEAD

// 9. Write a function in C to merge two arrays of the same size sorted in descending order.
import java.util.Arrays;
import java.util.Scanner;

public class A15Q09 {
    public static void func(int[] arr1, int[] arr2, int n) {
        int[] newarr = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            if (i < n) {
                newarr[i] = arr1[i];
            }
            if (i >= n) {
                newarr[i] = arr2[i - n];
            }
        }
        for (int i = 0; i < 2 * n; i++) {
            for (int j = i; j < 2 * n; j++) {
                int temp = newarr[i];
                if (newarr[i] < newarr[j] && i != j) {
                    newarr[i] = newarr[j];
                    newarr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(newarr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            arr2[i] = sc.nextInt();
        }
        func(arr1, arr2, size);
    }
}
=======

// 9. Write a function in C to merge two arrays of the same size sorted in descending order.
import java.util.Arrays;
import java.util.Scanner;

public class A15Q09 {
    public static void func(int[] arr1, int[] arr2, int n) {
        int[] newarr = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            if (i < n) {
                newarr[i] = arr1[i];
            }
            if (i >= n) {
                newarr[i] = arr2[i - n];
            }
        }
        for (int i = 0; i < 2 * n; i++) {
            for (int j = i; j < 2 * n; j++) {
                int temp = newarr[i];
                if (newarr[i] < newarr[j] && i != j) {
                    newarr[i] = newarr[j];
                    newarr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(newarr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            arr2[i] = sc.nextInt();
        }
        func(arr1, arr2, size);
    }
}
>>>>>>> 4e16ffaa01296d49afa2e8e1d3f70261a4dd6dd0
