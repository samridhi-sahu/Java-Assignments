// Write a java program to count digits in a given number

public class A03Q05 {
    public static void main(String[] args) {
        int number = 12345;
        int count = 0;
        for (int i = 0; number > 0; i++) {
            number = number / 10;
            count++;
        }

        System.out.println("Total digits in a given number 12345 is : " + count);
    }
}
