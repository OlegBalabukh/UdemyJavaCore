package Section4_Tests;

class Car7 {

    String name;

    public void start() {
        System.out.println("Car started!");
    }

    public Car7(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }
}

public class Test8_Constructors {
    public static void main(String[] args) {

        Car7 car = new Car7("audi");
        System.out.println(car.getName());
        car.start();

    }
}
