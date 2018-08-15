class Duck {

    private String name;
    private int id;

    public Duck(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        // Inefficient because every time you concatenating strings you create a new string
        // return id + ": " + name;

        /*
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);
        return sb.toString();
        */

        // second version
        return String.format("%4d: %s", id, name);
    }
}

public class Lesson21toStringMethod {
    public static void main(String[] args) {
        Duck duck1 = new Duck(2, "Betty");
        Duck duck2 = new Duck(5, "Daisy");

        System.out.println(duck1);
        System.out.println(duck2);
    }
}
