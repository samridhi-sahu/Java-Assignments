
// 6. WAP to print the name of the user with greeting message, in double quotes.

import java.util.Scanner;

public class A01Q06 {
    public static void main(String[] args) {
        System.out.print("Enter the Username : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("\"Hello!! " + str + ", Have a wonderful day.\"");
    }
}
