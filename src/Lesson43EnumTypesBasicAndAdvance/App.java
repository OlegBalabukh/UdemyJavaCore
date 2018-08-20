package Lesson43EnumTypesBasicAndAdvance;

public class App {

    // without enum
    /*
    public static final int DOG = 0;
    public static final int CAT = 1;
    public static final int MOUSE = 2;
    */

    public static void main(String[] args) {

        // without enum
        /*
        int animal = CAT;
        switch (animal) {
            case DOG:
                System.out.println("Dog");
                break;
            case CAT:
                System.out.println("cat");
                break;
        }
        */

        // with enum
        Animal animal = Animal.CAT;

        switch (animal) {
            case CAT:
                System.out.println("Cat");
                break;
            case DOG:
                System.out.println("Dog");
                break;
            case MOUSE:
                System.out.println("Mouse");
                break;
            default:
                System.out.println("The item is out of the enum!");
                break;
        }

        // CAT, DOG, MOUSE are objects of the type Animal
        System.out.println(Animal.DOG);
        // used to save an enum constant to a database as a string
        System.out.println("Enum name as a string: " + Animal.DOG.name());

        System.out.println();
        System.out.println(Animal.DOG.getClass());
        System.out.println(Animal.DOG instanceof Animal);
        System.out.println(Animal.DOG instanceof Enum); // Enum - parent class for all the enum instances

        System.out.println(Animal.MOUSE.getName());

        Animal animal2 = Animal.valueOf("CAT");
        System.out.println(animal2);  // "This animal is called: Fergus"; calls overwritten toString() method

    }
}
