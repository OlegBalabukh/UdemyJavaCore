package Lesson34HandlingExeptions.src.demo2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        File file = new File("example.txt"); // with example.txt, which is in working directory, there

        try (FileReader fr = new FileReader(file)) {
            // execute if there is no exception or no error condition
            System.out.println("<" + file.toString() + "> file is found in working directory");
        } catch (IOException e) {
            // this will be executed if an exception is thrown
            // e.printStackTrace(); // default output
            System.out.println("<" + file.toString() + "> file is not found in working directory");
        }

        // if exception is caught or there is no exception, you can continue
        System.out.println("Finished.");
    }
}