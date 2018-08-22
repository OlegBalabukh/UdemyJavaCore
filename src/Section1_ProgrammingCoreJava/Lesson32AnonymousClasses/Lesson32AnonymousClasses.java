package Section1_ProgrammingCoreJava.Lesson32AnonymousClasses;

class Engine {
    public void start() {
        System.out.println("Starting engine ...");
    }
}

interface Tree {
    public void grow();
}

public class Lesson32AnonymousClasses {
    public static void main(String[] args) {
        Engine engine1 = new Engine() {  // {} - anonymous class - a child class of machine, not machine itself (coz method overwritten)
            @Override
            public void start() {
                System.out.println("Engine working ...");
            }
        };

        engine1.start();

        // Tree tree1 = new Tree(); // error: cannot create an object of the class of interface

        Tree tree1 = new Tree() {  // declaring an anonymous class for Tree interface and pass it to the method at the same time

            @Override
            public void grow() {
                System.out.println("Tree growing");
            }
        }; // often used in listener event pattern, which is difficult for java beginners

        tree1.grow();
    }
}
