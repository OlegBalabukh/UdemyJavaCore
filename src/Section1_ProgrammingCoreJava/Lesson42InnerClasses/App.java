package Section1_ProgrammingCoreJava.Lesson42InnerClasses;

// It should be only one public class in java file with the same name as java file containing this class
public class App {
    public static void main(String[] args) {  // main - base class; entry point
        Robot robot = new Robot(8);
        robot.start();

        // creating new instance of inner class (Brain) outside the parent class (Robot)
        // only works if class Brain is declared as not private
        // Robot.Brain brain = robot.new Brain();
        // brain.think();

        Robot.Battery battery = new Robot.Battery();
        battery.charge();
    }
}
