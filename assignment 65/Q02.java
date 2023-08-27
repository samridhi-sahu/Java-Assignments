
// 2. Given a string Str. The task is to check if it is Pangram or not.
import java.util.*;

public class Q02 {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        if (ispangram(str))
            System.out.println("Given String is Pangram");
        else
            System.out.println("Given String is not Pangram");
    }

    static boolean ispangram(String str) {
        str = str.toLowerCase();
        HashSet<Character> ch = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if ((int) str.charAt(i) >= 97 && (int) str.charAt(i) <= 122)
                ch.add(str.charAt(i));
        }
        return ch.size() == 26;
    }
}
