// 10. Write a program to make the last digit of a number stored in a variable as zero.

public class A02Q10 {
    public static void main(String[] args) {
        int num = 1234;
        System.out.println("Number is : " + num);
        int lastdigit = num % 10;
        System.out.println("New number is : " + (num - lastdigit));
    }
}
