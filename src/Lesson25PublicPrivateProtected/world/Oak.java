package Lesson25PublicPrivateProtected.world;

public class Oak extends Plant {
    public Oak() {
        // Won't work -- type is private
        // type = "tree";

        // This works -- size is protected, Oak is a subclass of plant.
        this.size = "large";

        // No access specifier; works because Oak and Plant are in the same package
        this.height = 10;

    }
}
