public class A04Q12 {
    public static void main(String[] args) {
        char a;
        for (a = 'D'; a >= 'A'; a--) {
            for (char j = 'D'; j > a; j--) {
                System.out.print(" ");
            }
            for (char j = 'A'; j <= a; j++) {
                System.out.print(j);
            }
            for (int j = a - 1; j >= 'A'; j--) {
                char c = (char) j;
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
