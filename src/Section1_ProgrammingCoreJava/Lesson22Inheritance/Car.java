package Section1_ProgrammingCoreJava.Lesson22Inheritance;

public class Car extends Machine {  // Car is child of Machine; Machine is parent of Car

    // Overriding is possible only for methods, not variables
    @Override
    public void start() {
        System.out.println("Car started.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }

    public void wipeWindShield() {
        System.out.println("Wiping windshield.");
    }

    public void showInfo() {
        System.out.println("Car name: " + name);
    }
}
