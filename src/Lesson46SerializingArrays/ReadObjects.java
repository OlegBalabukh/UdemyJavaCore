package Lesson46SerializingArrays;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {
    public static void main(String[] args) {
        System.out.println("Reading objects...");

        try(FileInputStream fi = new FileInputStream("test.ser")) {

            ObjectInputStream os = new ObjectInputStream(fi);
            
            Person[] people = (Person[])os.readObject();

            /* "unchecked cast" -- warning because of "type erasure": information about type in
            diamond brackets of ArrayList is lost during compilation (writing file). Dismissing warning on the next line. */
            @SuppressWarnings("unchecked")
            ArrayList<Person> peopleList = (ArrayList<Person>)os.readObject();

            for (Person person: people) {
                System.out.println(person);
            }

            for (Person person: peopleList) {
                System.out.println(person);
            }

            // -----------------------------------------------------------------------------------
            // serialize / deserialize Person objects in Array list one at a time ... read in WriteObjects.java
            int num = os.readInt();

            for (int i = 0; i < num; i++) {
                Person person = (Person)os.readObject();
                System.out.println(person);
            }
            // -----------------------------------------------------------------------------------

            os.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
