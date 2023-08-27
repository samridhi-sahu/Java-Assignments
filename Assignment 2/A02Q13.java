// 13. Write a java program to take a three-digit number from the user and rotate its digits by one position towards the right.

import java.util.Scanner;

public class A02Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        while (num >= 1) {
            System.out.print(num % 10);
            num = num / 10;
        }
    }
}
