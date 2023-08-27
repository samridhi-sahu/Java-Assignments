<<<<<<< HEAD

//4. Write a function to rotate an array by n position in d direction. The d is an indicative value for left or right. 

import java.util.*;

public class A15Q04 {
    public static int[] newarray(int[] arr, int n, String d) {
        for (int j = 0; j < n; j++) {
            switch (d) {
                case "left":
                    int temp1 = arr[0];
                    for (int i = 1; i < arr.length; i++) {
                        arr[i - 1] = arr[i];
                    }
                    arr[arr.length - 1] = temp1;
                    break;
                case "right":
                    int temp2 = arr[arr.length - 1];
                    for (int i = arr.length - 2; i >= 0; i--) {
                        arr[i + 1] = arr[i];
                    }
                    arr[0] = temp2;
                    break;
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
        int n = sc.nextInt();
        String d = sc.next();
        int[] ans = newarray(arr, n, d);
        System.out.println(Arrays.toString(ans));
    }
}
=======

//4. Write a function to rotate an array by n position in d direction. The d is an indicative value for left or right. 

import java.util.*;

public class A15Q04 {
    public static int[] newarray(int[] arr, int n, String d) {
        for (int j = 0; j < n; j++) {
            switch (d) {
                case "left":
                    int temp1 = arr[0];
                    for (int i = 1; i < arr.length; i++) {
                        arr[i - 1] = arr[i];
                    }
                    arr[arr.length - 1] = temp1;
                    break;
                case "right":
                    int temp2 = arr[arr.length - 1];
                    for (int i = arr.length - 2; i >= 0; i--) {
                        arr[i + 1] = arr[i];
                    }
                    arr[0] = temp2;
                    break;
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
        int n = sc.nextInt();
        String d = sc.next();
        int[] ans = newarray(arr, n, d);
        System.out.println(Arrays.toString(ans));
    }
}
>>>>>>> 4e16ffaa01296d49afa2e8e1d3f70261a4dd6dd0
