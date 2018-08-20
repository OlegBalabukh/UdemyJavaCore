package Lesson41TheEqualsMethod;

import Lesson24Interfaces.Info;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() { // returns a hashcode of an object, for example "13b6d03"
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }
}

public class App {
    public static void main(String[] args) {

        System.out.println(new Object()); // returns a hashcode - the unique id, that each object has

        Person person1 = new Person(5, "Bob");
        Person person2 = new Person(8, "Sue");
        // System.out.println(person1 == person2); // false

        Person person3 = new Person(5, "Ben");  // this two objects contain the same info
        Person person4 = new Person(5, "Ben");  // but in terms of memory they are two dif entities, two dif objects
        // System.out.println(person3 == person4); // false again
        // System.out.println(person3.equals(person4)); // true (after overriding equals method() )

        // ------------------------------------------------------------ //

        Double value1 = 7.2;
        Double value2 = 7.2;
        // System.out.println(value1 == value2);  // false
        // System.out.println(value1.equals(value2)); // true

        Integer number1 = 6;
        Integer number2 = 6;
        // System.out.println(number1 == number2); // true, if "==" with integers, number1 and number2 referer to the same object
        // equals() is a safe way instead

        // ------------------------------------------------------------ //

        String text1 = "Hello";
        String text2 = "Hello";
        System.out.println(text1 == text2); // true, again optimising from java: text1 and text2 refer to the same object

        String text3 = "Hello";
        String text4 = "Helloadfoadrkfk".substring(0,5);
        System.out.println(text4);
        System.out.println(text3 == text4); // false, "==" fails now; so use .equals() to compare non-primitive values
        // Don't compare non-primitive numbers with "==", only use "==" to check if two references point at literally the same object
    }

}
