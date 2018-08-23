package Section2_JavaCollectionsFramework.Lesson8NaturalOrdering;

import java.util.*;

class Person implements Comparable<Person>{ // implementing Comparable interface fixes errors #1 , #2
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    /*
     * compareTo() is fixed to be able to add items not only
     * to sets but also to TreeSet type instances:
     */
    /*
    // 1. sorting using numerical / string (in this case) fields
    @Override
    public int compareTo(Person person) {
        return name.compareTo(person.name);
        // return -name.compareTo(person.name); // negative alphabetical order
    }
    */

    // 2. sorting on the length of a string
    @Override
    public int compareTo(Person person) {
        int len1 = name.length();  // earlier person
        int len2 = person.name.length(); // current person

        if (len1 > len2) {
            return 1;
        }
        else if (len1 < len2) {
            return -1;
        }
        /*
        * bug: in this case "Sue" will be absent in sorted output because of "return 0":
        * there already is name with a length 3 - "Joe", so "Sue" won't be added to the
        * set of type TreeSet, which includes only unique values
        *
        */
        // return 0;
        /*
         * fixed; in this case "return 0" if the two names are in fact actually equal;
         * upper code compares length of the names, this row compares names if their
         * length is equal
         */
        return name.compareTo(person.name);
    }

    //  equals() and hashCode() doesn't make any changes in this case

    /*
     * to add elements (objects) to a set (not TreeSet type!) you need to
     * define equals() and hashCode() methods (Lesson6)
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

}

public class App {
    public static void main(String[] args) {

        // Natural order in lists and sets of strings
        /*
        List<String> list = new ArrayList<String>();
        SortedSet<String> set = new TreeSet<String>();

        addElements(list);
        addElements(set);

        // Sorting the list; sets of a type TreeSet have natural order by default
        Collections.sort(list);

        showElements(list);
        System.out.println();
        showElements(set);
        */

        // Natural order in lists and sets of custom objects

        List<Person> list = new ArrayList<Person>();
        SortedSet<Person> set = new TreeSet<Person>();

        addElements(list);
        addElements(set);

        // Error #1
        // object of type Person doesn't yet have a natural order, - you can't call Collections.sort() on it
        Collections.sort(list);

        // Error #2
        // in console after run: you can't add elements to a set of type TreeSet if they aren't in natural order

        showElements(list);
        System.out.println();
        showElements(set);


    }

    /*
     * Both list and set implement Collection interface,
     * which is a super interface of list and set,
     * so we use Collection interface  to pass list or set to a method
     */

    // Methods for lists and sets of strings
    /*
    private static void addElements(Collection<String> col) {
        col.add("Joe");
        col.add("Sue");
        col.add("Juliet");
        col.add("Clare");
        col.add("Mike");
    }
    
    private static void showElements(Collection<String> col) {
        for (String element: col) {
            System.out.println(element);
        }
    }
    */

    // Methods for lists and sets of custom objects
    private static void addElements(Collection<Person> col) {
        col.add(new Person("Joe"));
        col.add(new Person("Sue"));
        col.add(new Person("Juliet"));
        col.add(new Person("Clare"));
        col.add(new Person("Mike"));
    }

    private static void showElements(Collection<Person> col) {
        for (Person element: col) {
            System.out.println(element);
        }
    }
}
