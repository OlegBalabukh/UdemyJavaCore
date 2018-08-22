package Section2_JavaCollectionsFramework.Lesson3HashMap;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        /*
        * Maps store pairs of values where one member of the pair is called
        * the key and the other is called the value. The only thing to watch:
        * if you have your own custom objects as the keys in a map, you have to
        * implement the hash codes and the equals methods.
        * HashMap is not sorted in any way; maps do not maintain order.
        */

        HashMap<Integer, String > map = new HashMap<Integer, String>();

        map.put(5, "Five");
        map.put(8, "Eight");
        map.put(6, "Six");
        map.put(4, "Four");
        map.put(2, "Two");
        map.put(6, "Hello");

        String text1 = map.get(4);   // Four
        String text2 = map.get(444); // null
        // you can have duplicate values but not duplicate keys
        String text3 = map.get(6);   // hello -- second put overrides the first key

        System.out.println(text1);

        // Iterating through HashMap
        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + ": " + value);
        }


    }
}
