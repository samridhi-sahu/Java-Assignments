// 3. Write a java program to swap values of two int variables

public class A02Q03 {
    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 7;
        System.out.println("Numbers before swapping, first number = " + num1 + " and second number " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Numbers after swapping, first number = " + num1 + " and second number " + num2);

    }
}
