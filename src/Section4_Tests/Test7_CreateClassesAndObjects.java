package Section4_Tests;

class Car {
    public void start() {
        System.out.println("Car started!");
    }
}

public class Test7_CreateClassesAndObjects {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
