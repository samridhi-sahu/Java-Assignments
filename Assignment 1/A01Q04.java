// 4. WAP to find the area of the circle. Take radius of circle from user as input and print the result

import java.util.Scanner;

public class A01Q04 {
    public static void main(String[] args) {
        System.out.println("Enter Radius of the Circle");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextFloat();
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println("Area of circle is " + area + " sq units, having the radius " + radius + " unit ");
    }
}
