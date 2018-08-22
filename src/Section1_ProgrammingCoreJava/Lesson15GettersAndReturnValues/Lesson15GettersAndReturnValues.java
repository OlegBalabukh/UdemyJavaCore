package Section1_ProgrammingCoreJava.Lesson15GettersAndReturnValues;

class Employee {
    String name;
    int age;

    void speak() {
        System.out.println("My name is " + name);
    }

    /*
    void calculateYearsToRetirement() { // keyword "void" means that method does not return anything
        int yearsLeft = 65 - age;

        System.out.println(yearsLeft);
    }
    */

    int calculateYearsToRetirement() { // keyword "int" means the type of data to be returned
        return 65 - age;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }
}

public class Lesson15GettersAndReturnValues {
    public static void main(String[] args) {
        Employee employee1 = new Employee();

        employee1.name = "Joe";
        employee1.age = 25;

        //employee1.speak();
        // employee1.calculateYearsToRetirement();
        int years = employee1.calculateYearsToRetirement();
        System.out.println("Years till retirements " + years + ".");

        int age = employee1.getAge();
        String name = employee1.getName();
        System.out.println("Name is: " + name + ". Age is: " + age);
    }
}
