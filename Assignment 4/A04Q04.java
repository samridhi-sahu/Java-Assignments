// Write a java program to print given pattern

public class A04Q04 {
    public static void main(String[] args) {
        char c = '*';
        for (int i = 1; i < 6; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(c);
            }
            System.out.println();
        }

    }
}
