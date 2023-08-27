public class A04Q14 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i >= 2 && i <= 4) {
                System.out.print("*");
                for (int j = 2; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            } else if (i > 4) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
