<<<<<<< HEAD

// 8. Write a program to find second smallest in an array.Take array values from the user.
import java.util.*;

public class A14Q08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        int smallest = arr[0];
        int secsmallest = arr[1];

        for (int i = 0; i < 10; i++) {
            if (smallest >= arr[i]) {
                smallest = arr[i];
            }
        }
        for (int i = 0; i < 10; i++) {
            if (arr[i] != smallest) {
                if (secsmallest >= arr[i]) {
                    secsmallest = arr[i];
                }
            }
        }
        System.out.println("second largest number stored in an array is : " + secsmallest);

    }
}
=======

// 8. Write a program to find second smallest in an array.Take array values from the user.
import java.util.*;

public class A14Q08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        int smallest = arr[0];
        int secsmallest = arr[1];

        for (int i = 0; i < 10; i++) {
            if (smallest >= arr[i]) {
                smallest = arr[i];
            }
        }
        for (int i = 0; i < 10; i++) {
            if (arr[i] != smallest) {
                if (secsmallest >= arr[i]) {
                    secsmallest = arr[i];
                }
            }
        }
        System.out.println("second largest number stored in an array is : " + secsmallest);

    }
}
>>>>>>> 4e16ffaa01296d49afa2e8e1d3f70261a4dd6dd0
