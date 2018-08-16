package Lesson23Packages.src.appPackage;

// package's names should be unique and lowercase
import Lesson23Packages.src.ocean.Fish;
import Lesson23Packages.src.ocean.Seaweed;
// or
// import Lesson23Packages.src.ocean.*;

public class App {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Seaweed seaweed = new Seaweed();
    }
}
