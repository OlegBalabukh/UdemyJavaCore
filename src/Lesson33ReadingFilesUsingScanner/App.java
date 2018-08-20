package Lesson33ReadingFilesUsingScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        // String fileName = "C:\\Users\\obalab\\Desktop\\example.txt";
        String fileName = "example.txt";  // if a file is in the working directory (UdemyJavaCore)

        File textFile = new File(fileName);

        Scanner in = new Scanner(textFile);

        int value = in.nextInt();
        System.out.println("Read value: " + value);

        in.nextLine(); // reads carriage return and line feed at the end of the first line (after "3")

        /*
        while(in.hasNextLine()) {
            String line = in.nextLine();
            System.out.println(line);
        }
        */

        // task: read  three lines in file, starting from 2 line because the first line
        // is an integer which points how many line to read;
        int count = 2;

        while(in.hasNextLine()) {
            String line = in.nextLine();

            System.out.println(count + ": " + line);
            count++;
            /*
            if (count > value + 1) {  // reads only first three lines starting from line 2
                break;
            }
            */
        }

        in.close();
    }
}
