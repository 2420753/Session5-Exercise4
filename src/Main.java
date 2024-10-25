import java.util.Scanner;


public class Main {
    private static final Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        int userInput1 = stdin.nextInt();

        System.out.print("Enter the second number: ");
        int userInput2 = stdin.nextInt();

        int[] userArray = new int[2];
        userArray[0] = userInput1;
        userArray[1] = userInput2;

        int tempValue;
        tempValue = userArray[0];
        userArray[0] = userArray[1];
        userArray[1] = tempValue;

        for (int i = 0; i < userArray.length; i++){
            if (i == 0) {
                System.out.print("Swapping the numbers now.\n");
                System.out.print("The first index is " + userArray[0] + "\n");

            } else {
                System.out.print("The second index is: " + userArray[1]);
            }
        }
    }

}
