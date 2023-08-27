import java.util.*;

class a {
    public static int minCostToMoveChips(int[] position) {
        int element = 0;
        int[] ocr = new int[position.length];
        for (int i = 0; i < position.length; i++) {
            int n = 0;
            element = position[i];
            for (int j = 0; j < position.length; j++) {
                if (position[j] == element) {
                    n += 1;
                }
            }
            ocr[i] = element + n;
        }
        int max = 0;
        int x = 0;
        for (int i = 0; i < position.length; i++) {
            if (max <= ocr[i] - position[i]) {
                max = ocr[i] - position[i];
                x = position[i];
            }
        }
        int count = 0;
        int a = x;
        for (int i = 0; i < position.length; i++) {
            if ((a - position[i]) % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = minCostToMoveChips(arr);
        System.out.println(ans);
    }
}