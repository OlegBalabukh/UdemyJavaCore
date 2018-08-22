package Section1_ProgrammingCoreJava.Lesson10Arrays;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // primitive (value) type or "bucket", which includes a primitive value
        int value = 7;

        // reference type or "label", which have a reference to the array in memory
        int[] values;
        values = new int[3];

        //System.out.println(values[0]);
        values[0] = 10;
        values[1] = 20;
        values[2] = 30;

        //System.out.println(values[0]);
        //System.out.println(values[1]);
        //System.out.println(values[2]);

        for (int i = 0; i < values.length ; i++) {
            System.out.println(values[i]);
        }

        int[] numbers = {5, 6, 7};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int arr [] = {1,34,45,56,67};
        System.out.println(Arrays.toString(arr));
    }
}