package Lesson35MultipleExceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

<<<<<<< HEAD
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
=======
public class App {
    /*
    // throwing exceptions directly out of the main method
    public static void main(String[] args) throws IOException, ParseException {
        Test test = new Test();
        test.run();
    }
    */

    // handling the exceptions
    public static void main(String[] args) throws IOException {

        Test test = new Test();

        // 1 catch
>>>>>>> 7ae8df53eeb9f13a953df7ee2e2a59fe283148af
        /*
        try {
            test.run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
<<<<<<< HEAD
            // e.printStackTrace();
            System.out.println("Couldn't parse command file.");
        }
        */

        ///////////// 2 //////////////
=======
            System.out.println("Couldn't parse command file."); // this works as we throw ParseException in Test.java
        }
        */

       // 2 multi-catch (from java 7)
>>>>>>> 7ae8df53eeb9f13a953df7ee2e2a59fe283148af
        /*
        try {
            test.run();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        */

<<<<<<< HEAD
        ///////////// 3 //////////////

        // concept of polymorphism: you can always pass a child class wherever a parent class is expected
        // Exception - parent class (for IOException ParseException) which catches all exceptions
=======
        // 3 ; concept of polymorphism: you can always pass a child wherever a parent class is expected

        /*
        * This can catch any kind of exception, because Exception is a parent class
        * ans we could use any child class here, when a parent class is expected
        * IOException and ParseException are child classes of Exception
        * */

>>>>>>> 7ae8df53eeb9f13a953df7ee2e2a59fe283148af

        try {
            test.run();
        } catch (Exception e) {
            e.printStackTrace();
        }

<<<<<<< HEAD
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


=======
        // if more common IOException will be the first, we never catch more specific FileNotFoundException which follows it
        // and second catch block with FileNotFoundException would be unreachable (due to polymorphism)
        try {
            test.input();
        } catch (FileNotFoundException e) { // FileNotFoundException is child of IOException, so it should be first
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
>>>>>>> 7ae8df53eeb9f13a953df7ee2e2a59fe283148af
    }
}
