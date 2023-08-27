// 1. Given a list of words followed by two words, the task is to find the minimum distance between the given two words in the list of words.
public class Q01 {
    public static void main(String[] args) {
        String[] S = { "the", "quick", "brown", "fox", "quick" };
        String word1 = "the", word2 = "fox";
        int dis = Distance(S, word1, word2);
        System.out.print(dis);
    }

    static int Distance(String[] S, String word1, String word2) {
        int one = 0, two = 0;
        for (int i = 0; i < S.length; i++) {
            if (S[i].equals(word1))
                one = i;
            if (S[i].equals(word2))
                two = i;
        }
        return (int) Math.abs(one - two);
    }
}