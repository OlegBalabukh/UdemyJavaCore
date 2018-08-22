package Section1_ProgrammingCoreJava.Lesson47TransientKeywordAndMoreSerialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class WriteObjects {
    public static void main(String[] args) {
        System.out.println("Writing objects...");

        try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test.ser"))) {

            Person person = new Person(7, "Bob");
            // we use "Person" instead of "person" because "count" is static variable (set for all objects of that class)
            Person.setCount(88);
            os.writeObject(person); // with transient id is initialized to a default value ("0")

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
