package Section2_JavaCollectionsFramework.Lesson2LinkedLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        /*
        * ArrayLists manage arrays internally
        * [0][1][2][3][4][5] .... fast: reading values, adding to (removing from) the end
        */
        List<Integer> arrayList = new ArrayList<Integer>(); // for removing last item in a list

        /*
         * linkedLists consists of elements where each element
         * has a reference to the previous and next element
         * [0]->[1]->[2]->[3] .... fast: adding to (removing from) an any segment of the list
         *    <-   <-   <-
         *    reading - slow - because of traversing the list
         */
        List<Integer> linkedList = new LinkedList<Integer>(); // for removing any other item in a list

        doTimings("ArrayList", arrayList);
        doTimings("LinkedList", linkedList);
    }

    private static void doTimings(String type, List<Integer> list) {

        for (int i = 0; i < 1E5; i++) { // 1E5 == 100 000
            list.add(i);
        }

        long start = System.currentTimeMillis();

        /*
        // Add items at the end of list
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }
        */

        // Add items elsewhere in list (at the beginning in this case)
        for (int i = 0; i < 1E5; i++) {
            list.add(15000, i);
        }

        // for linkedList doesn't matter where you add the items - time is the same

        long end = System.currentTimeMillis();

        System.out.println("time taken: " + (end - start) + " ms for " + type);
    }
}
