// Write a java program to check whether roots of a given quadratic equation are real & distinct, real & equal or imaginary roots

public class A03Q04 {
    public static void main(String[] args) {
        String equation = "x^2-6x+5=0";
        double a = 1, b = -6, c = 5;
        double D = ((b * b) - 4 * a * c);
        System.out.println("Quadratic equation is : " + equation);
        if (D < 0) {
            System.out.println("Roots of the given Quadratic Equation are imaginary");
        } else if (D == 0) {
            System.out.println("Roots of the given Quadratic Equation are real & equal");
        } else {
            System.out.println("Roots of the given Quadratic Equation are real & distinct");
        }
    }
}
