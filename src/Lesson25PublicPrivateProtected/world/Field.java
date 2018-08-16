package Lesson25PublicPrivateProtected.world;

public class Field {
    private  Plant plant = new Plant();

    public Field() {

        // works: size is protected; Field is in the same package as Plant
        System.out.println(plant.size);
    }
}
