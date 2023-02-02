
// 9. Write a java program to print size of an int, a float, a char and a double type variable

import java.util.*;

public class A02Q09 {
    public static void main(String[] args) {
        System.out.println("Size of int variable : " + (Integer.SIZE / 8) + " Bytes");
        System.out.println("Size of float variable : " + (Float.SIZE / 8) + " Bytes");
        System.out.println("Size of char variable : " + (Character.SIZE / 8) + " Bytes");
        System.out.println("Size of double variable : " + (Double.SIZE / 8) + " Bytes");
    }
}
