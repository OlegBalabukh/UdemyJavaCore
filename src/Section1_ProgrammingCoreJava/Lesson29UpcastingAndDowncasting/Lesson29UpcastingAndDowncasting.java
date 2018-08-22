package Section1_ProgrammingCoreJava.Lesson29UpcastingAndDowncasting;

class  Mechanism {
    public void start() {
        System.out.println("Mechanism started.");
    }
}

class Camera extends Mechanism {
    public void start() {
        System.out.println("Camera started.");
    }

    public void snap() {
        System.out.println("Photo taken.");
    }
}

public class Lesson29UpcastingAndDowncasting {
    public static void main(String[] args) {
        Mechanism mechanism1 = new Mechanism();
        Camera camera1 = new Camera();

        mechanism1.start();
        camera1.start();
        camera1.snap();

        // Upcasting: "upcasted up" child class (Camera) or variable (camera1) to variable mechanism2 of parent class Mechanism
        // Upcasting is safe because of polymorphism
        Mechanism mechanism2 = new Camera(); // or = camera1 (variable); polymorphism
        mechanism2.start(); // camera started
        // mechanism2.snap(); // won't work, it is undefined for type Mechanism but ((Camera) mechanism2).snap(); - works

        // Downcasting (unlike upcasting) is inherently unsafe, because - look mechanism4
        Mechanism mechanism3 = new Camera();
        Camera camera2 = (Camera)mechanism3;
        camera2.start();
        camera2.snap();

        // Doesn't work -- runtime error
        /*
            Downcasting is inherently unsafe and you have really think when you're doing downcasting
            and you wanna be really sure that the var you're downcasting really does refer to an object of the type
            you're downcasting to. You can't downcasting between unrelated types, because you cant change one object
            to another object. All you can do is change the references and the references then depend on the underlying
            object, which doesn't change, to invoke the correct code.
         */

        Mechanism mechanism4 = new Mechanism();
        // Camera camera3 = (Camera)mechanism4;
        // camera3.start(); // Exception: Mechanism cannot be cast to Camera
        // camera3.snap();  // the same



    }
}
