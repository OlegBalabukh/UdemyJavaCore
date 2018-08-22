package Section2_JavaCollectionsFramework.Lesson1ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class App {
    public static void main(String[] args) {
        // Can't use primitive types in <>
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding
        numbers.add(10);
        numbers.add(100);
        numbers.add(40);
        numbers.add(11);
        numbers.add(374);

        // Retrieving
        System.out.println(numbers.get(0));

        System.out.println("\nIteration #1: ");
        // Indexed for loop iteration
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // Removing
        numbers.remove(0);  // first element (this is slow), to remove first/middle items use linked list
        numbers.remove(numbers.size() - 1); // last element

        System.out.println("\nIteration #2: ");
        for (Integer value: numbers) {
            System.out.println(value);
        }

        // List interface ... (collection classes are grouped by interfaces)
        List<String> values = new ArrayList<String>();
    }
}
