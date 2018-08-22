package Section1_ProgrammingCoreJava.Lesson40CreatingAndReadingTextFiles;

import java.io.*;

public class App {
    public static void main(String[] args) {
        File file = new File("writeText.txt");

        try( BufferedWriter br = new BufferedWriter(new FileWriter(file)) ) { // with this syntax br.close() method is not needed
            br.write("This is line one");
            br.newLine();
            br.write("This is line two");
            br.newLine();
            br.newLine();
            br.write("last line.");
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file.toString());
        }
    }
}
