package Section1_ProgrammingCoreJava.Lesson25PublicPrivateProtected.world;



public class Plant {
    // Bad practice
    public String name;

    // Acceptable practice  -- it's final
    public  final static int ID = 8;

    // Acceptable only within Plant class
    private String type;

    // Acceptable within the class, within any subclass and also within the same package
    protected String size;

    // if access specifier is absent, it's package-level visibility
    int height;

    public Plant() {
        this.name = "Freddy";
        this.type = "plant";
        this.size = "medium";
        this.height = 11;
    }
}
