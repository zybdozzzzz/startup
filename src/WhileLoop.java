import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userinput = "";
        while(!userinput.equals("q")){
            System.out.println("Enter anything:");
            userinput = input.nextLine();

            for (char c:userinput.toCharArray()){
                System.out.println((int)c);
            }
        }
        System.out.println("While loop ends.");
    }
}
