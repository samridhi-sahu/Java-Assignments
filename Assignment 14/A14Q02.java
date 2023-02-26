
// 2. Write a program to calculate the average of numbers stored in an array of size 10. Take array values from the user.
import java.util.*;

public class A14Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        float sum = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println(sum / arr.length);
    }
}
