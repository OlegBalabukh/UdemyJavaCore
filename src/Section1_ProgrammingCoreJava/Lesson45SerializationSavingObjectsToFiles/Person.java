package Section1_ProgrammingCoreJava.Lesson45SerializationSavingObjectsToFiles;

import java.io.Serializable;

// Serialization - turning object into binary data (writing objects);
// Deserialization - turning binary data back into object (reading objects)
// Serializable - implements Serializable interface; make an object able to turning its data into binary format
public class Person implements Serializable { // to resolve NotSerializableException

    /* in some IDE like Eclipse it is recommended to add serialVersionUID to a class we
     * use for creating instances we try to write into a file or read from a file. This
     * id is for checking that you're reading with the exact same class that you wrote with.
     */

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