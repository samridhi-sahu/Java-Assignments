// 1. Write a java program to print unit digit of a number

import java.util.Scanner;

public class A02Q01 {
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int remainder = number % 10;
        System.out.print("Unit digit of a number is : " + remainder);
    }
}
