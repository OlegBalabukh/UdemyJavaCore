package Lesson14Methods;

import java.util.Calendar;

class Human {

    // Instance variables (data or "state")
    String name;
    int age;

    // Classes can contain

    // 1. Data (represents state: height, weight, age, mood ...)
    // 2. Subroutines (methods)
    // Subroutines - a set of instructions designed to perform a frequently used operation within a program.
    void speak() {
        for (int i=0; i < 3; i++) {
            System.out.println("My name is " + name + " and I am " + age + " years old.");
        }
    }

    void sayHello() {
        System.out.println("Hello there! I am " + name + ".");
    }

    void sayBirthYear() {
        int birthYear = Calendar.getInstance().get(Calendar.YEAR) - age;
        System.out.println("My name is " + name + ". " + "I was born in " + birthYear + ".");
    }
}

public class Lesson14Methods {
    public static void main(String[] args) {
        Human person1 = new Human();
        person1.name = "Bob Jackson";
        person1.age = 31;
        person1.speak();
        person1.sayHello();
        person1.sayBirthYear();

        //type  name     new human object
        Human person2 = new Human();
        person2.name = "Jack Wilson";
        person2.age = 44;
        person2.speak();
        person2.sayHello();
        person2.sayBirthYear();
    }
}