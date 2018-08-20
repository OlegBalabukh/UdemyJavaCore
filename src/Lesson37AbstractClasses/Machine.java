package Lesson37AbstractClasses;
// Machine is a base class, that implements some common functionality that any machine has.
// After adding "abstract" keyword, Machine becomes an abstract class
/*
* Abstract class:
* -- can have abstract methods
* -- you cannot create an instance of an abstract class
* --
* */

/**
 * abstract class vs interface
 * -- abstract class as a class implements fundamental identity of all the child classes
 * -- a class can implement many interfaces, but it only can have one parent class
 * -- so it can have only one abstract class in the hierarchy
 * -- you only going to be able to extend one abstract class, but you can implement many interfaces
 * -- parent class determines what your child class is\
 * -- implementing an interface just determines one thing that it does, but through many interfaces a class can do many things
 * -- you cannot have code in an interface (all implementations completely up to the child class) but in an abstract class you can
 *    provide default functionality
 */

public abstract class Machine {
    private  int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void start(); // only child classed will have this method, not Machine itself
    public  abstract void doStuff();
    public abstract void shutDown();

    public void  run() {
        start();
        doStuff();
        shutDown();
    }
}
