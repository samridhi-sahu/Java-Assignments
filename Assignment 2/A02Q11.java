// 11. Write a java program to input a number from the user and also input a digit. Append a digit in the number and print the resulting number.

import java.util.Scanner;

public class A02Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        System.out.print("Enter digit : ");
        int digit = sc.nextInt();
        int result = num * 10 + digit;
        System.out.println("new resulting number is : " + result);

    }
}
