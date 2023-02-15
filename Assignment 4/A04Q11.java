public class A04Q11 {
    public static void main(String[] args) {
        int i;
        int m = 1;
        for (i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            if (i == 4) {
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j);
                }
            } else {
                for (int k = 2; k < 2 * m - 1; k++) {
                    System.out.print(" ");
                }
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }
            }
            m++;
            System.out.println();
        }
    }
}
