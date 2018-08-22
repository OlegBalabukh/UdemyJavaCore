package Section1_ProgrammingCoreJava.Lesson46SerializingArrays;

import java.io.Serializable;


public class Person implements Serializable { // implements serializable interface to make an object serializable

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }
}
