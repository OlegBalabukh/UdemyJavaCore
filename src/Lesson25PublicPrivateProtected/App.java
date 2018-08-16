package Lesson25PublicPrivateProtected;

import Lesson25PublicPrivateProtected.world.Plant;

// won't work
/*
private class Something { // private or else
}
*/

class SomethingElse {  // as many as needed within a file
}
/*
   --  applies only to instance variables not to classes  ---
   --  but each file can have only one public class which matches the file name  --
 * private --- only within same class
 * public --- from anywhere
 * protected -- same class, subclass, and same package
 * no modifier -- same package only
 */


public class App {
    public static void main(String[] args) {
        Plant plant = new Plant();

        System.out.println(plant.name);
        System.out.println(Plant.ID);

        // Won't work -- type is private
        // System.out.println(plant.type);

        // size is protected but App is not at the same package as Plant;
        // So, won't work
        // System.out.println(plant.size);

        // won't work because App and Plant are in different packages, height has package-level visibility
        // System.out.println(plant.height);


    }

}
