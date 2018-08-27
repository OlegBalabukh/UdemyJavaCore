package Section4_Tests;

public class Test6_LoopingThroughTwoDimensionalArrays {
    public static void main(String[] args) {

        String[][] strings = {
                {"Apple", "Pear", "Peach"},
                {"Tomato", "Cucumber", "Onion"}
        };

        for (int row = 0; row < strings.length; row++) {
            for (int col = 0; col < strings[row].length; col++) {
                System.out.print(strings[row][col]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
