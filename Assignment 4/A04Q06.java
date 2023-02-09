// Write a java program to print given pattern

public class A04Q06 {
    public static void main(String[] args) {
        char c = '*';
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 11 - 2 * i; j >= 1; j--) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
