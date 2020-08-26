import java.util.Scanner;

public class ControlStruct {
    public static void main(String[] args){

        Scanner numberscanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = Integer.parseInt(numberscanner.nextLine());
        System.out.println("Enter the second number:");
        int num2 = Integer.parseInt(numberscanner.nextLine());

        if (num1 > num2) {
            System.out.println( num1+" is bigger.");
        }
        else if (num1 < num2) {
            System.out.println( num2 + " is bigger");
        }
        else {
            System.out.println("They are equal.");
        }
    }
}
