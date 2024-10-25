import java.util.Scanner;


public class exerciseP2 {
    private static final Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {

        String[] userArray = new String[3];
        userArray[0] = "One";
        userArray[1] = "Two";
        userArray[2] = "Three";

        for (int i = userArray.length -1 ; i >= 0; i--) {
            System.out.println(userArray[i]);
        }
    }
}