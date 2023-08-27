// 12. Assume price of 1 USD is INR 76.23. Write a program to take the amount in INR and convert it into USD.

import java.util.Scanner;

public class A02Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount in INR : ");
        double inr = sc.nextInt();
        double usd = inr / 76.23;
        System.out.println("Amount in USD is : " + usd + " USD");
    }
}
