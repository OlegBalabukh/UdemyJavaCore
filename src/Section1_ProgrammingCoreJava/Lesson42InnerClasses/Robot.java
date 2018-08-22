package Section1_ProgrammingCoreJava.Lesson42InnerClasses;

public class Robot {
    private int id;

    // #1 - non-static, inner class
    /*
    * Used:
    * most often for logically grouping: bits of outer classes, some functionality
    * if you need the class to have access to the instance variables of the enclosing (Robot) outer class
     */
    private class Brain { // may be private
        public void think() {
            System.out.println("Robot " + id + " is thinking.");
        }
    }

    // #2 - static inner class
    /*
    * Used:
    * for grouping classes together
    * if you just want a normal class that isn't associated with instances of the enclosing outer class
     */
    public static class Battery {
        public void charge() {
            System.out.println("Battery charging..."); // can't add 'id' here, because 'id' is not static
        }
    }

    // constructor
    public Robot(int id) {
        this.id = id;
    }

    public void start() {
        System.out.println("Starting robot " + id);

        Brain brain = new Brain();
        brain.think();

        String name = "Robert";

        // #3 - you can declare classes even within methods
        /*
        * is useful if you need an instance of a class to pass to another method
        * can be used instead of creating anonymous class if you need to use the class only in this method
        * because you can't refer Temp class outside the start() method
        */

        class Temp {
            public void doSomething() {
                System.out.println("ID is: " + id);
                System.out.println("My name is: " + name);
            }
        }

        Temp temp = new Temp();
        temp.doSomething();
    }
}
