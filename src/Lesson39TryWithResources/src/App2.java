package Lesson39TryWithResources.src;

import java.io.*;

// Lesson38ReadingFilesWithFileReader with java 7  approach

public class App2 {
    public static void main(String[] args) {
        File file = new File("te66xt.txt");

        try( BufferedReader br = new BufferedReader(new FileReader(file)) ) {

            String line;
            while( (line = br.readLine()) != null) { // reads all file
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Can't find file: " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file.toString());
        }

    }
}
