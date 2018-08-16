package Lesson25PublicPrivateProtected;

import Lesson25PublicPrivateProtected.world.Plant;

public class Grass extends Plant {
    public Grass () {

        // won't work -- Grass not in the same package as Plant, even though it's a subclass
        // System.out.println(this.height);
    }

}
