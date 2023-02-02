// 10. WAP to take time as an input and display the result on the screen.

import java.io.Reader;
import java.io.StringReader;
import java.util.Scanner;

public class A01Q09 {
    public static void main(String[] args) {
        System.out.print("Enter Time here in hh:mm format - ");
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        Reader read = new StringReader(time);
        try (Scanner scan = new Scanner(read).useDelimiter(":")) {
            int hour = scan.nextInt();
            int minute = scan.nextInt();
            System.out.println(hour + " Hour and " + minute + " Minute");

        }
    }
}
