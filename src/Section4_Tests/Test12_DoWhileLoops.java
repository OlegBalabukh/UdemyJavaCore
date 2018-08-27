package Section4_Tests;

import java.util.Scanner;

public class Test12_DoWhileLoops {
    public static void main(String[] args) {

        int value = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please, enter an integer greater than '10': ");
            value = input.nextInt();
        }
        while (value <= 10);

        System.out.println("Integer greater than 10 detected!");
    }
}
