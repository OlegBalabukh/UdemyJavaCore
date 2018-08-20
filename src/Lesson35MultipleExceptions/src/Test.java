package Lesson35MultipleExceptions.src;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Test {

    public void run() throws IOException, ParseException { // list of exceptions, but with this approach you can throw only one exception at a time
       //  throw new IOException();
        throw new ParseException("Error in command list.", 2);
    }

    public void input() throws  IOException, FileNotFoundException {

    }
}
