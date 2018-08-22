package Section2_JavaCollectionsFramework.Lesson4SortedMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        // Map<Integer, String> hashMap = new HashMap<Integer, String>(); // using interface

        // ===============================================================================

        /*
        * LinkedHashMap basically is just the same as HashMap except that it has
        * double-link-list connecting the entries; that means that keys and values
        * stay in the same order that you add them to the map.
        */
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        // Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>(); // using interface

        // ===============================================================================

        /*
        * TreeMap sorts entries (map items) in natural order;
        * for integers natural order is "1, 2, 3 .."; for strings - alphabetical order
        */
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        // Map<Integer, String> treeMap = new TreeMap<Integer, String>();  // using interface

        // ===============================================================================

        System.out.println("hashMap: ");
        testMap(hashMap);                       // keys in numerical order are not guaranteed
        System.out.println("\nlinkedHashMap: ");
        testMap(linkedHashMap);                 //  keys in the same order as were added
        System.out.println("\ntreeMap: ");
        testMap(treeMap);                       // keys in natural (numerical in this case) order are guaranteed
    }

    /*
     * Collections classes (in Collections framework) are organized under various interfaces.
     * The main of them are: List, Map, Set.
     */

    public  static void testMap(Map<Integer, String> map) {
        map.put(9, "fox");
        map.put(4, "cat");
        map.put(8, "dog");
        map.put(1, "giraffe");
        map.put(0, "swan");
        map.put(15, "bear");
        map.put(6, "snake");

        for (Integer key: map.keySet()) {
            String value = map.get(key);

            System.out.println(key + ": " + value);
        }
    }
}
