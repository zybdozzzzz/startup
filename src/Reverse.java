import java.util.Scanner;

public class Reverse {
    /**
     *
     * @param args Ignored
     */
    public static void main(String[] args) {
        System.out.println("How many letters you are entering today?");
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());

        String[] s = new String[num];

        for (int i = 0; i < s.length; i++){
            System.out.println("Enter your letter:");
            s[i] = in.nextLine();
        }

        for (int i = s.length-1; i >= 0; i--){
            System.out.println(s[i]);
        }
    }
}
