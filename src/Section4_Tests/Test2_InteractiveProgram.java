package Section4_Tests;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2_InteractiveProgram {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please, enter an integer: ");

        int intValue = 0;

        try {
            intValue = userInput.nextInt();

            if (intValue < 10) {
                System.out.println("This number is too small.");
            }
            else {
                System.out.println("This number is big enough");
            }

        } catch (InputMismatchException e) {
            System.out.println("You entered incorrect value");
        }

    }
}
