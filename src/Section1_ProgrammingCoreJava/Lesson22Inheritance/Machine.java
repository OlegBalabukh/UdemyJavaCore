package Section1_ProgrammingCoreJava.Lesson22Inheritance;

public class Machine {

    // private String name = "Machine type 1"; // won't work
    // String name = "Machine type 1"; // will work
    protected String name = "Machine type 1"; // will work in child classes

    public  void start() {
        System.out.println("Machine started.");
    }

    public void stop() {
        System.out.println("Machine stopped.");
    }
}


