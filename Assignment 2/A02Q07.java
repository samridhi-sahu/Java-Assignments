// 7. Write a java program to find the position of first 1 in LSB.

public class A02Q07 {
    public static void main(String[] args) {
        int num = 11;
        System.out.println("Integer Number : " + num);
        String bnry = Integer.toBinaryString(num);
        System.out.println("Number in Binary : " + bnry);
        int count = 0;
        for (int i = bnry.length() - 1; i >= 0; i--) {
            count++;
            if (bnry.charAt(i) == '1') {
                break;
            }
        }
        System.out.println(count);
    }
}
