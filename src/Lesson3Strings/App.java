package Lesson3Strings;

public class App {
    public static void main(String[] args) {
        int myInt = 8;

        String text = "Hello";
        String blank = " ";
        String name = "Oleg";
        String greeting = text + blank + name;

        System.out.println(greeting);
        System.out.println("Hello" + " " + "Oleg");
        System.out.println("My integer is: " + myInt);
        double myDouble = 11.8;
        System.out.println("My number is: " + myDouble + ".");
    }
}
