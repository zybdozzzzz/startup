import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner numberin = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num1 = Integer.parseInt(numberin.nextLine());

        int sum = 1;
        for (int i = num1; i > 0; i -= 3){
        sum *= i;
        }
        System.out.println(sum +" is your sum.");
    }
}
