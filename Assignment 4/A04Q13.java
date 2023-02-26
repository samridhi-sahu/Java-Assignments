public class A04Q13 {
    public static void main(String[] args) {
        char c;
        int i = 1;
        for (c = 'G'; c >= 'A'; c--) {
            for (char j = 'A'; j <= c; j++) {
                System.out.print(j);
            }
            if (c == 'G') {
                for (int j = c - 1; j >= 'A'; j--) {
                    char s = (char) j;
                    System.out.print(s);
                }
            } else {
                for (int j = 2; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                for (char j = c; j >= 'A'; j--) {
                    System.out.print(j);
                }
            }
            i++;
            System.out.println();
        }
    }
}
