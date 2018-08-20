package Lesson26Polymorphism;


// Polymorphism - you can use child class everywhere you can use parent
public class App {
    public static void main(String[] args) {
        Plant plant1 = new Plant();
        Tree tree = new Tree();

        // Plant plant2 = plant1; // second reference to the same object

        Plant plant2 = tree; // polymorphism

        plant2.grow();

        tree.shedLeaves();

        /*
        // won't work because matters the type of var (type is Plant, which don't have method .shedLeaves()), and plant2 is just a reference to tree
         // plant2.shedLeaves();
        */
        ((Tree) plant2).shedLeaves(); // will work

        doGrow(tree); // polymorphism: whatever a parent class is expected, we can use child class of tha parent
    }
    public static void doGrow(Plant plant) {
        plant.grow();
    }
}
