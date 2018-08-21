package Lesson35MultipleExceptions;

import java.io.FileNotFoundException;
import java.io.IOException;


// 1
/*
public class Lesson13ClassesAndObjects {
    public static void main(String[] args) throws IOException, ParseException {
        Test test = new Test();

        test.run();
    }
}
*/

// 2

public class App {
    public static void main(String[] args) {
        Test test = new Test();

        ///////////// 1 //////////////

        /*
        try {
            test.run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {

            // e.printStackTrace();
            System.out.println("Couldn't parse command file.");
        }
        */

        ///////////// 2 //////////////

        /*
        try {
            test.run();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        */


        ///////////// 3 //////////////

        // concept of polymorphism: you can always pass a child class wherever a parent class is expected
        // Exception - parent class (for IOException ParseException) which catches all exceptions

        try {
            test.run();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            test.input();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        *  FileNotFoundException before IOException (if vice-versa - will be an error) because
        *  FileNotFoundException is a child of IOException and if parent IOException would be the fist,
        *  it would be caught the exception and the next catch block with FileNotFoundException would be useless
        *
        *  catching  multiple exceptions, order them from more specific to more common
        *
        */

    }
}
