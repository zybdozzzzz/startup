import java.util.Scanner;

/**
 * Nothing in there
 * Don't read
 * I told you do not read
 */

public class Blalalah {
    public static void main(String[] args) {
        System.out.println("Enter two numbers below");
        Scanner number = new Scanner(System.in);
        double a = Double.parseDouble(number.nextLine()); // take in a number from user
        double b = Double.parseDouble(number.nextLine());

        double result = sum(a, b);
        System.out.println(result);
    }

    /**
     *
     * @param num1
     * @param num2
     * @return
     */
    public static double sum(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }
}
