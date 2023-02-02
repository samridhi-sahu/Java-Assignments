// 5. Write a java program to input a three-digit number and display the sum of the digits.

import java.util.Scanner;

public class A02Q05 {
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = 0;
        if (num > 999) {
            System.out.println("You have entered more than three digits.");
        } else {
            for (int i = 0; i < 3; i++) {
                x += num % 10;
                num = num / 10;
            }
            System.out.println("Sum of the digits is : " + x);
        }
    }
}
