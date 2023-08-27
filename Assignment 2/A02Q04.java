
// 4. Write a java program to swap values of two int variables without using a third variable.

public class A02Q04 {
    public static void main(String[] args) {
        int a = 11;
        int b = 7;
        System.out.println("Numbers before swapping, first number = " + a + " and second number " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Numbers after swapping, first number = " + a + " and second number " + b);

    }
}
