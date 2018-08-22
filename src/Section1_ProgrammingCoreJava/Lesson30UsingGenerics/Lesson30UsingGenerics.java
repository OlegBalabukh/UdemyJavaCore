package Section1_ProgrammingCoreJava.Lesson30UsingGenerics;

import java.util.ArrayList;
import java.util.HashMap;

// Generic class is a class that can work with other objects and you specify what type of object it can work with
// when you instantiate a class, when you create objects from the class

class Animal {

}

public class Lesson30UsingGenerics {
    public static void main(String[] args) {
        ////////////////////  Before Java 5  ////////////////////
        ArrayList list = new ArrayList();

        list.add("apple");
        list.add("banana");
        list.add("orange");

        String fruit = (String)list.get(1); // downcasting object string (without downcasting get returns an object, so error)
        System.out.println(fruit);

        ////////////////////  Modern style  ////////////////////
        // In a class, using generics, you can specify what kind of object you want that class to work with

        ArrayList<String> strings = new ArrayList<>();
        strings.add("cat");
        strings.add("dog");
        strings.add("alligator");

        String animal = strings.get(1); // get() returns a string type, without downcasting
        System.out.println(animal);

        ////////////////////  There can be more than one type of argument  ////////////////////
        HashMap<Integer, String> map = new HashMap<>();

        /////  Java 7 style  /////
        ArrayList<Animal> animalList = new ArrayList<>();
    }
}
