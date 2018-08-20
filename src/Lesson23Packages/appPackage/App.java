package Lesson23Packages.appPackage;

// package's names should be unique and lowercase
import Lesson23Packages.ocean.Fish;
import Lesson23Packages.ocean.Seaweed;
// or
// import Lesson23Packages.ocean.*;

public class App {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Seaweed seaweed = new Seaweed();
    }
}
