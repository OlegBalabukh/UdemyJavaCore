class Person {  // is not a person, a class represents an idea of a person in general

    // Instance variables (data or "state")
    String name;
    int age;

    // Classes can contain

    // 1. Data (represents state: height, weight, age, mood ...)
    // 2. Subroutines (methods)
    // Subroutines - a set of instructions designed to perform a frequently used operation within a program.
}


public class Lesson13ClassesAndObjects {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "John Doe";
        person1.age = 31;

        //type  name     new person object
        Person person2 = new Person();
        person2.name = "Ben Johnson";
        person2.age = 44;

        System.out.println(person1.name);
    }
}
