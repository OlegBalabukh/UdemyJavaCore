package Lesson45SerializationSavingObjectsToFiles;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {
    public static void main(String[] args) {
        System.out.println("Writing objects...");

        Person mike = new Person(543, "Mike");
        Person sue = new Person(123, "Sue");

        System.out.println(mike);
        System.out.println(sue);

        // syntax in line 1 will automatically call the close method with this object (from java7 and later)
        // FileOutputStream writes bytes into a file
        // ObjectOutputStream is used to write java objects
        try(FileOutputStream fs = new FileOutputStream("people.bin")) { // 1

            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(mike);
            os.writeObject(sue);

            os.close();

        } catch (FileNotFoundException e) {
            // e.printStackTrace();
            System.out.println("File not found...");
        } catch (IOException e) {
            e.printStackTrace();
            // System.out.println("Unable to write into file");
        }

    }
}
