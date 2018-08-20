package Lesson35MultipleExceptions.src;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

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
        /*
        try {
            test.run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Couldn't parse command file."); // this works as we throw ParseException in Test.java
        }
        */

       // 2 multi-catch (from java 7)
        /*
        try {
            test.run();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        */

        // 3 ; concept of polymorphism: you can always pass a child wherever a parent class is expected

        /*
        * This can catch any kind of exception, because Exception is a parent class
        * ans we could use any child class here, when a parent class is expected
        * IOException and ParseException are child classes of Exception
        * */


        try {
            test.run();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // if more common IOException will be the first, we never catch more specific FileNotFoundException which follows it
        // and second catch block with FileNotFoundException would be unreachable (due to polymorphism)
        try {
            test.input();
        } catch (FileNotFoundException e) { // FileNotFoundException is child of IOException, so it should be first
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
