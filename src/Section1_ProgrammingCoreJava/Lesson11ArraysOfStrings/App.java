package Section1_ProgrammingCoreJava.Lesson11ArraysOfStrings;

public class App {
    public static void main(String[] args) {
        String[] words = new String[3];

        words[0] = "Hello";
        words[1] = "to";
        words[2] = "you";

        System.out.println(words[2]);

        // OR
        String[] fruits = {"apple", "banana", "pear", "kiwi"};

        for (String fruit: fruits) {
            System.out.println(fruit);
        }

        // default value - 0
        int value = 0;

        // text - reference to string in memory; default value - null
        String text = null;
        System.out.println(text);

        String[] texts = new String[2];
        System.out.println(texts[0]);
        texts[0] = "one";
    }
}
