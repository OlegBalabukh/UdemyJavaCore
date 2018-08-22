package Section1_ProgrammingCoreJava.Lesson23Packages.appPackage;

// package's names should be unique and lowercase
import Section1_ProgrammingCoreJava.Lesson23Packages.ocean.Fish;
import Section1_ProgrammingCoreJava.Lesson23Packages.ocean.Seaweed;
// or
// import Section1_ProgrammingCoreJava.Lesson23Packages.ocean.*;

public class App {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Seaweed seaweed = new Seaweed();
    }
}
