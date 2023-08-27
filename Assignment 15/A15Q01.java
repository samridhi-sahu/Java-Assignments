<<<<<<< HEAD

// 1. Write a function to find the greatest number from the given array of any size. (TSRS)
import java.util.*;

public class A15Q01 {
    public static int max(int[] arr) {
        int greatest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (greatest <= arr[i]) {
                greatest = arr[i];
            }
        }
        return greatest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = max(arr);
        System.out.println(ans);
    }
}
=======

// 1. Write a function to find the greatest number from the given array of any size. (TSRS)
import java.util.*;

public class A15Q01 {
    public static int max(int[] arr) {
        int greatest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (greatest <= arr[i]) {
                greatest = arr[i];
            }
        }
        return greatest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = max(arr);
        System.out.println(ans);
    }
}
>>>>>>> 4e16ffaa01296d49afa2e8e1d3f70261a4dd6dd0
