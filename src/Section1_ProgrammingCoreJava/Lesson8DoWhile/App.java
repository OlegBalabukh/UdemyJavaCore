package Section1_ProgrammingCoreJava.Lesson8DoWhile;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);

        /*
        System.out.println("Enter a number: ");
        int value = scanner.nextInt();

        while(value != 5) {
            System.out.println("Enter a number: ");
            value = scanner.nextInt();
        }
        */

        int value;
        do {
            System.out.println("Enter a number: ");
            value = scanner.nextInt();
        }
        while(value != 5);

        System.out.println("Got 5!");
    }
}
