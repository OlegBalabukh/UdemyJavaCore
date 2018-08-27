package Section4_Tests;

import java.util.Scanner;

public class Test10_ImprovedUseOfScanner {
    public static void main(String[] args) {

        int value = 0;
        Scanner input = new Scanner(System.in);

        while (value != 5) {
            System.out.println("Please, enter the number '5': ");

            if (input.hasNextInt()) {
                value = input.nextInt();
            }
            else {
                input.nextLine();
            }
        }
    }
}
