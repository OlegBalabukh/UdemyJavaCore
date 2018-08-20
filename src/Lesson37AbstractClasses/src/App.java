package Lesson37AbstractClasses.src;

public class App {
    public static void main(String[] args) {
        Camera cam1 = new Camera();
        cam1.setId(5);

        Car car1 = new Car();
        car1.setId(8);

        // Machine machine1 = new Machine(); // this won't work as Machine becomes abstract class

        car1.run();

    }
}


