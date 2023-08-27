// 10. WAP to take Date of birth as an input and display the result on the screen.

import java.io.Reader;
import java.io.StringReader;
import java.util.Scanner;

public class A01Q08 {
    public static void main(String[] args) {
        System.out.print("Enter Date Of Birth in DD/MM/YYYY format : ");
        Scanner sc = new Scanner(System.in);
        String DateOfBirth = sc.nextLine();
        Reader rd = new StringReader(DateOfBirth);
        try (Scanner scan = new Scanner(rd).useDelimiter("/")) {
            int day = scan.nextInt();
            int month = scan.nextInt();
            int year = scan.nextInt();
            System.out.println("Day = " + day + ", Month = " + month + ", Year = " + year);
        }

    }
}
