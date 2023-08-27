
// 3. Given two strings, the task is to find if a string can be obtained by rotating another string two places.

public class Q03 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String str1 = "amazon";
        String str2 = "azonam";
        StringBuilder bd = new StringBuilder(str1);
        int place = 2;
        for (int i = 0, j = place - 1; i < j; i++, j--) {
            char temp = bd.charAt(i);
            bd.setCharAt(i, (char) bd.charAt(j));
            bd.setCharAt(j, (char) temp);
        }
        for (int i = place, j = str1.length() - 1; i < j; i++, j--) {
            char temp = bd.charAt(i);
            bd.setCharAt(i, (char) bd.charAt(j));
            bd.setCharAt(j, (char) temp);
        }
        for (int i = 0, j = str1.length() - 1; i < j; i++, j--) {
            char temp = bd.charAt(i);
            bd.setCharAt(i, (char) bd.charAt(j));
            bd.setCharAt(j, (char) temp);
        }
        str1 = bd.toString();
        if (str1.equals(str2))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

}
