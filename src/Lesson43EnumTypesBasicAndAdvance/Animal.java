package Lesson43EnumTypesBasicAndAdvance;

// enum - special type that can be set to only represent certain members of a fixed set
// Basic usage

public enum Animal { // "enum" - all keywords in java are lowercase

    // without constructor
    // CAT, DOG, MOUSE

    // with constructor
    // CAT, DOG, MOUSE are objects of the type Animal
    CAT("Fergus"), DOG("Fido"), MOUSE("Jerry");

    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "This animal is called: " + name;
    }

    // other methods can be implemented here
}


