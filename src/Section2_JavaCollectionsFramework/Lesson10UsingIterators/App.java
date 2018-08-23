package Section2_JavaCollectionsFramework.Lesson10UsingIterators;

import java.util.Iterator;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {

        LinkedList<String> animals = new LinkedList<String>();

        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");

        Iterator<String> it = animals.iterator();
        while(it.hasNext()) {
            String value = it.next();
            System.out.println(value);

            if (value.equals("cat")) {  // iterator allows remove items during iteration
                it.remove();
            }
        }
        // For adding items use ListIterator instead of Iterator

        System.out.println();

        // Modern iteration, java 5 and later
        for (String animal: animals) {
            System.out.println(animal);

            // error: can't remove item while you're iterating through the list
            // animals.remove(2);
        }
    }
}
