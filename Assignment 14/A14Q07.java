<<<<<<< HEAD

// 7. Write a program to find second largest in an array.Take array values from the user.
import java.util.*;

public class A14Q07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        int greatest = arr[0];
        int secgreatest = arr[1];

        for (int i = 0; i < 10; i++) {
            if (greatest <= arr[i]) {
                greatest = arr[i];
            }
        }
        for (int i = 0; i < 10; i++) {
            if (arr[i] != greatest) {
                if (secgreatest <= arr[i]) {
                    secgreatest = arr[i];
                }
            }
        }
        System.out.println("second largest number stored in an array is : " + secgreatest);

    }
}
=======

// 7. Write a program to find second largest in an array.Take array values from the user.
import java.util.*;

public class A14Q07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        int greatest = arr[0];
        int secgreatest = arr[1];

        for (int i = 0; i < 10; i++) {
            if (greatest <= arr[i]) {
                greatest = arr[i];
            }
        }
        for (int i = 0; i < 10; i++) {
            if (arr[i] != greatest) {
                if (secgreatest <= arr[i]) {
                    secgreatest = arr[i];
                }
            }
        }
        System.out.println("second largest number stored in an array is : " + secgreatest);

    }
}
>>>>>>> 4e16ffaa01296d49afa2e8e1d3f70261a4dd6dd0
