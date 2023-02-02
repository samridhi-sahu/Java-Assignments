// 6. Write a java program which takes a character as an input and displays its ASCII code.

import java.util.Scanner;

public class A02Q06 {
    public static void main(String[] args) {
        System.out.print("Enter Character : ");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int ascii = (int) c;
        System.out.println("ASCII code for input character is : 5" + ascii);
    }
}
