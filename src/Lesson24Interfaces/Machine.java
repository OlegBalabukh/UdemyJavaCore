package Lesson24Interfaces;

public class Machine implements Info {  // a class can implement many interfaces but can extend only from one parent class
    private int id = 7;
    public void start() {
        System.out.println("Machine started.");
    }

    @Override  // optional
    public void showInfo() {
        System.out.println("Machine ID is: " + id);
    }
}
