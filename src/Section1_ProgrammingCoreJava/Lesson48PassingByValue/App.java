package Section1_ProgrammingCoreJava.Lesson48PassingByValue;

public class App {
    public static void main(String[] args) {

        // app variable is declared to call non static methods of this class
        App app = new App();

        // ========================================================
        // passing by value (copying a value into a method)
        int value = 11;   // var "value" contains value itself (if value is primitive)

        System.out.println("1. Value is: " + value);

        app.show(value);  // value's copy as method's parameter

        System.out.println("4. Value is: " + value);
        // ========================================================
        System.out.println();

        // passing by value too (copying an address to an object into a method)
        // var "person" contains an address of an object in memory
        Person person = new Person("Bob");
        System.out.println("1. Person is: " + person);

        app.show(person);

        System.out.println("4. Person is: " + person);
    }

    public void show(int value) {
        System.out.println("2. Value is: " + value);
        value = 8;
        System.out.println("3. Value is: " + value);
    }

    // method overloading: methods with the same name and different argument list
    public void show(Person person) {
        System.out.println("2. Person is: " + person);
        // person.setName("Sue"); // if here, points to "Bob" and changes it
        person = new Person("Mike");
        person.setName("Sue");  // if here, points to "Mike" and changes it
        System.out.println("3. Person is: " + person);
    }
}

// There's no passing by reference in java
