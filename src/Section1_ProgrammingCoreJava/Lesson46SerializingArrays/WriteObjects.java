package Section1_ProgrammingCoreJava.Lesson46SerializingArrays;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {
    public static void main(String[] args) {
        System.out.println("Writing objects...");

        // array
        Person[] people = {new Person(1, "Sue"), new Person(99, "Mike"), new Person(7, "Bob")};

        // array people turned into Array list
        ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));

        // We also can place os in try block (to call the close method automatically like for fs)
        try(FileOutputStream fs = new FileOutputStream("test.ser"); ObjectOutputStream os = new ObjectOutputStream(fs)) {

            os.writeObject(people);

            os.writeObject(peopleList);

            // -----------------------------------------------------------------------------------
            /* it is possible to serialize / deserialize Person objects in Array list one at a time
             *  or same for any object (array people ,etc) by writing in advance the number of sub
             *  objects that you're going to deal with.
             */

            os.writeInt(peopleList.size());
            // os.writeInt(people.length);

            for (Person person: peopleList) {
                os.writeObject(person);
            }

            // -----------------------------------------------------------------------------------


            //os.close();

        } catch (FileNotFoundException e) {
            // e.printStackTrace();
            System.out.println("File not found...");
        } catch (IOException e) {
            e.printStackTrace();
            // System.out.println("Unable to write into file");
        }

    }
}
