package Section4_Tests;

import java.util.Scanner;

public class Test9_WhileLoops {
    public static void main(String[] args) {
        int value = 0;

        Scanner input = new Scanner(System.in);

        while (value != 5) {
            System.out.println("Please, enter the number '5': ");
            value = input.nextInt();
        }

        System.out.println("Got it!");
    }
}
