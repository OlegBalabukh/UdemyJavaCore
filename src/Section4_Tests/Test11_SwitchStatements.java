package Section4_Tests;

import java.util.Scanner;

public class Test11_SwitchStatements {
    public static void main(String[] args) {

        int value = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter the number: ");

        while (value != 1) {
            if (input.hasNextInt()) {

                value = input.nextInt();

                switch (value) {
                    case 1:
                        System.out.println("Got 1");
                        break;
                    case 66:
                        System.out.println("Got 66");
                        break;

                    default:
                        System.out.println("Got something else");
                }

                break; // breaks while loop if switch has worked
            }
            else {
                System.out.println("Not an integer. Try again: ");
                input.nextLine();
            }
        }
    }
}
