// 8. Write a java program to check whether the given number is even or odd using a "bitwise" operator.

public class A02Q08 {
    public static void main(String[] args) {
        int num = 27;
        System.out.println("Integer Number : " + num);
        if ((num & 1) == 1) {
            System.out.println("Given Number is odd");
        } else {
            System.out.println("Given Number is even");
        }
    }

}
