package Lesson19StaticAndFinal;

class Thing {
    public final static int LUCKY_NUMBER = 11; // final - can't be changed, constant

    public  String name; // non-static variable is associated with an instance of a class (each object can have it) (instance variable)
    public static String description;  // static variable belong to the class, one copy as it is one class (class variable)

    public  static int count = 0;

    public  int id;

    public  Thing() { // this (default) constructor will be run every time new instance of a Lesson19StaticAndFinal.Thing is created
        id = count;
        count++;
    }

    public void showName() {     // instance method
        //System.out.println(name);
        System.out.println("Object id: " + id + ", " + description + ": " + name); // works: instance method can output static variable
    }

    // you may use a static method if it output some data and never deals with instance data (only with static data)
    public  static void showInfo() { // class method
        //System.out.println("Hello");
        System.out.println(description);
        // System.out.println(name); // error: static method can't output instance variable
    }
}

public class Lesson19StaticAndFinal {
    public static void main(String[] args) {

        Thing.description = "I am a thing";
        Thing.showInfo();

        System.out.println("Before creating objects, count is: " + Thing.count);
        Thing thing1 = new Thing();
        Thing thing2 = new Thing();
        System.out.println("After creating objects, count is: " + Thing.count);

        thing1.name = "Bob";
        thing2.name = "Sue";

        thing1.showName();
        thing2.showName();

        System.out.println(Math.PI); // example of usage static variable
        // Math.PI = 3; error: can"t modify constant variable (name of a constant: all uppercase letters)

        System.out.println(Thing.LUCKY_NUMBER);  // output created constant var


    }
}
