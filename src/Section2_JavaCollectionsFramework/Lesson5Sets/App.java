package Section2_JavaCollectionsFramework.Lesson5Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        // A set is a kind of collection that stores only unique elements

        // ===============================================================================

        // HashSet does not retain order
        // Set<String> set1 = new HashSet<String>();  // Creating new HashSet object using Set interface
        // HashSet<String> set1 = new HashSet<String>(); // the same, using HashSet class type

        // ===============================================================================

        // LinkedHashSet remembers the order you added items in
        // Set<String> set1 = new LinkedHashSet<String>();

        // TreeSet sorts in natural order (alphabetical order for strings)
        Set<String> set1 = new TreeSet<String>();

        // Checking if set is empty
        if (set1.isEmpty()) {
            System.out.println("Set is empty at start");
        }

        set1.add("dog");
        set1.add("cat");
        set1.add("mouse");
        set1.add("snake");
        set1.add("bear");

        if (set1.isEmpty()) {
            System.out.println("Set is empty after adding (won't output)");
        }

        // Adding duplicate items does nothing
        set1.add("mouse");

        System.out.println(set1);

        /////////////////     Iteration     /////////////////

        for (String element: set1) {
            System.out.println(element);
        }

        ///////     Does set contain a given item     ///////
        // Sets, unlike lists, are optimized to find a particular item quickly

        if (set1.contains("aardvark")) {
            System.out.println("Contains aardvark");
        }
        if (set1.contains("cat")) {
            System.out.println("Contains cat");
        }

        ///////////////     Intersection     ///////////////

        Set<String> set2 = new TreeSet<String>();

        set2.add("dog");
        set2.add("cat");
        set2.add("giraffe");
        set2.add("monkey");
        set2.add("ant");

        /*
        * set2 contains some common elements with set1, and some new
        * Intersection - which elements are common for set1 and set2
        * First, create copy for set1
        */

        Set<String> intersection = new HashSet<String>(set1);

        intersection.retainAll(set2);
        System.out.println(intersection); // [cat, dog]

        /////////////////     Difference     /////////////////

        // create copy for set1
        Set<String> uniqueForSet1 = new HashSet<String>(set1);

        uniqueForSet1.removeAll(set2); // which are in set1 and aren't in set2
        System.out.println(uniqueForSet1); // [mouse, snake, bear]

        // and vice-versa

        // create copy for set2
        Set<String> uniqueForSet2 = new HashSet<String>(set2);

        uniqueForSet2.removeAll(set1); // which are in set2 and aren't in set1
        System.out.println(uniqueForSet2); // [monkey, ant, giraffe]
    }
}
