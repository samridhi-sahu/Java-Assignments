// 2. Write a java program to print a number without its last digit.

import java.util.Scanner;

public class A02Q02 {
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("Number without last digit is : " + num / 10);
    }
}
