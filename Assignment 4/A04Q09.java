// Write a java program to print given pattern

public class A04Q09 {
    public static void main(String[] args) {
        int i;
        for (i = 4; i >= 1; i--) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
