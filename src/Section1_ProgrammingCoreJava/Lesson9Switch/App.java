package Section1_ProgrammingCoreJava.Lesson9Switch;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a command: ");
        String text = input.nextLine();

        // case must be constants (string, integer), not blocks
        switch (text) {
            case "start":
                System.out.println("Machine started!");
                break;

            case "stop":
                System.out.println("Machine stopped.");
                break;

            default:
                System.out.println("Command not recognized");
        }
    }
}
