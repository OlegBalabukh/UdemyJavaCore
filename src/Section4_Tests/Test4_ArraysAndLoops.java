package Section4_Tests;

public class Test4_ArraysAndLoops {
    public static void main(String[] args) {

        double[] array = {0.21, 0.366, 2.7, 3.3678, 6.1};

        for (int i = 0; i < array.length ; i++) {
            System.out.printf("%.2f ", array[i]);
        }
    }
}
