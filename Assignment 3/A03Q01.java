// 1. Write a java program to take marks of 5 subjects from the user. Assume marks are given out of 100 and passing marks is 33. Now display whether the candidate passed the examination or failed.

import java.util.Scanner;

public class A03Q01 {
    public static void main(String[] args) {
        System.out.print("Enter marks of 5 subjects : ");
        Scanner sc = new Scanner(System.in);
        Double total = 0.0;
        for (int i = 0; i < 5; i++) {
            double marks = sc.nextDouble();
            total += marks;
        }
        double result = total * 100 / 500;
        System.out.println("Your Result is : " + result);
        if (result >= 33) {
            System.out.println("hurrah!! you PASSED the examination");
        } else {
            System.out.println("ups sorry!! you FAILED the examination");
        }
    }
}
