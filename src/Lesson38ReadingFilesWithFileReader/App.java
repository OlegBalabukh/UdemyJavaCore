package Lesson38ReadingFilesWithFileReader;

import java.io.*;

// "ugly" java 6  approach, old style

public class App {
    public static void main(String[] args) {

        File file = new File("text.txt");  // 1st class; try to change name and see an output

        /**
         * assigned to null because if FileReader line throws an exception, next line -- br = new BufferedReader(fr) -- won't be executed
         * -- catch block will be -- and it will try to call br.close() on something that has no value, which we can't do         *
         */
        BufferedReader br = null;

        try {
            FileReader fr = new FileReader(file);   // 2nd class
             br = new BufferedReader(fr); // 3rd class on top; allows processing one line in the file at a time

            String line;

            // line = br.readLine(); // reads only first line
            // System.out.println(line);

            while( (line = br.readLine()) != null) { // reads all file
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString()); // output the name of the missing file (text.txt, not test.txt is present)
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file.toString());
        }
        finally { // is always guarantee to be executed (except if computer stops working:) )
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Unable to close file:" + file.toString());
            } catch (NullPointerException ex) {
                // File was probably never opened!
            }
        }
    }
}
