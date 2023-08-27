<<<<<<< HEAD

// 4. Write a program to find the greatest number stored in an array of size 10. Take array values from the user.
import java.util.*;

public class A14Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        int greatest = arr[0];
        for (int i = 1; i < 10; i++) {
            if (greatest <= arr[i]) {
                greatest = arr[i];
            }
        }
        System.out.println("greatest number stored in an array is : " + greatest);

    }
}
=======

// 4. Write a program to find the greatest number stored in an array of size 10. Take array values from the user.
import java.util.*;

public class A14Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        int greatest = arr[0];
        for (int i = 1; i < 10; i++) {
            if (greatest <= arr[i]) {
                greatest = arr[i];
            }
        }
        System.out.println("greatest number stored in an array is : " + greatest);

    }
}
>>>>>>> 4e16ffaa01296d49afa2e8e1d3f70261a4dd6dd0
