
// 3. Write a program to calculate the sum of all even numbers and sum of all odd numbers, which are stored in an array of size 10. Take array values from the user.
import java.util.*;

public class A14Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int evensum = 0, oddsum = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                evensum += arr[i];
            } else {
                oddsum += arr[i];
            }
        }
        System.out.println("sum of all even numbers : " + evensum);
        System.out.println("sum of all odd numbers : " + oddsum);

    }
}
