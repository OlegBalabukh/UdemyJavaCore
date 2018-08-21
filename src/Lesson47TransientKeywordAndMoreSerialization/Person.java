package Lesson47TransientKeywordAndMoreSerialization;

import java.io.Serializable;

// "transient" keyword is used when you're serializing objects
// it is used to prevent fields to be serialized in objects (like locks etc).
public class Person implements Serializable {

    // class level fields (id, int, count) have default fields; method fields haven't
    private transient int id;
    private String name;

    // won't serialize / deserialize because there's no need to serialize a static field
    private static int count;

    // Deserialization is one situation where you're getting an object without running any constructor at all
    public Person() {
        System.out.println("default constructor");
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;

        System.out.println("Two-argument constructor");
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}' + ", Count is: " + count;
    }
}
