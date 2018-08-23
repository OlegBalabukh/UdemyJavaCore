package Section2_JavaCollectionsFramework.Lesson6CustomObjectsInSetsAndKeysInMaps;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Person {
    private  int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "{ID is: " + id + "; name is: " + name + "}";
    }

    //  equals() and hashCode() check if custom objects in sets and keys in maps are unique
    //  without overriding this methods we'll have duplicates ("Sue") in set and map instances
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }
}

public class App {
    public static void main(String[] args) {

        /*
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("one", 1);  // won't be output to the console (keys in map unique)

        for (String key: map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        Set<String> set = new LinkedHashSet<String>();

        set.add("dog");
        set.add("cat");
        set.add("mouse");
        set.add("cat"); // has not added "cat" twice (elements in set unique)

        System.out.println(set);
        */

        Person p1 = new Person(0, "Bob");
        Person p2 = new Person(1, "Sue");
        Person p3 = new Person(2, "Mike");
        Person p4 = new Person(1, "Sue");

        Map<Person, Integer> map = new LinkedHashMap<Person, Integer>();

        map.put(p1, 1);
        map.put(p2, 2);
        map.put(p3, 3);
        map.put(p4, 1);

        for (Person key: map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        Set<Person> set = new LinkedHashSet<Person>();

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4); // has not added "cat" twice (elements in set unique)

        System.out.println(set);
    }
}
