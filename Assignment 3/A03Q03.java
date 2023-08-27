import java.util.Scanner;

public class A03Q03 {
    public static void main(String[] args) {
        System.out.print("Enter month number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12) {
            System.out.println("Total days are 31");
        } else if (n == 4 || n == 6 || n == 9 || n == 11) {
            System.out.println("Total days are 30");
        } else {
            System.out.println("Total days are 28 or 29");
        }
    }
}
