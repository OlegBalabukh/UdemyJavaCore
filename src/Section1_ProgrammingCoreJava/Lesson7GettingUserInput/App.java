package Section1_ProgrammingCoreJava.Lesson7GettingUserInput;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Create scanner object
        Scanner input = new Scanner(System.in);

        // Output the prompt
        // System.out.println("Enter a line of text: ");
        // System.out.println("Enter an integer: ");
        System.out.println("Enter a floating point value: ");

        // Wait for user to enter something
        // String line = input.nextLine();
        // int intValue = input.nextInt();
        double doubValue = input.nextDouble();

        // Tell them what they entered
        // System.out.println("You entered: " + line);
        // System.out.println("You entered: " + intValue);
        System.out.println("You entered: " + doubValue);
    }
}
