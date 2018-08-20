package Lesson35MultipleExceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Test {
<<<<<<< HEAD
    public void run() throws IOException, ParseException {
        // throw new IOException();
        throw new ParseException("Error in command list.", 2);
    }

    public void input() throws IOException, FileNotFoundException {
=======

    public void run() throws IOException, ParseException { // list of exceptions, but with this approach you can throw only one exception at a time
       //  throw new IOException();
        throw new ParseException("Error in command list.", 2);
    }

    public void input() throws  IOException, FileNotFoundException {
>>>>>>> 7ae8df53eeb9f13a953df7ee2e2a59fe283148af

    }
}
