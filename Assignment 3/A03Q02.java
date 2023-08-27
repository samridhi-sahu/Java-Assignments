
// 2. Write a java program which takes the length of the sides of a triangle as an input. Display whether the triangle is valid or not.

import java.util.Scanner;

public class A03Q02 {
    public static void main(String[] args) {
        System.out.print("Enter sides of the Triangle : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        /*
         * we know that if some sum any two sides of tringle is greater than the third
         * side then triangle is valid.
         */

        if (a + b > c || b + c > a || a + c > b) {
            System.out.println("It is a VALID TRIANGLE");
        } else {
            System.out.println("It is an INVALID TRIANGLE");
        }
    }
}