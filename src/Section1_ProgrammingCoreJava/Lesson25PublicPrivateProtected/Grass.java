package Section1_ProgrammingCoreJava.Lesson25PublicPrivateProtected;

import Section1_ProgrammingCoreJava.Lesson25PublicPrivateProtected.world.Plant;

public class Grass extends Plant {
    public Grass () {

        // won't work -- Grass not in the same package as Plant, even though it's a subclass
        // System.out.println(this.height);
    }

}
