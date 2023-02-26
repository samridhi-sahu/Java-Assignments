// Write a java program to print given pattern

public class A04Q01 {
    public static void main(String[] args) {
        char c = '*';
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }

    }
}
