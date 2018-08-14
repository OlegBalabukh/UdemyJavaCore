class Robot {
    public void speak(String text) {
        System.out.println(text);
    }

    public void jump(int height) {
        System.out.println("Jumping: " +  height);
    }

    public void move( String direction, double distance) {
        System.out.println("Moving " + distance + " meters in direction " + direction);
    }
}

public class Lesson16MethodParameters {
    public static void main(String[] args) {
        Robot sam = new Robot();
        sam.speak("Hi! I am Sam.");
        sam.jump(7);
        sam.move("West", 2.5);

        String greeting = "Hello there.";
        sam.speak(greeting); // "greeting" - like a label (reference to the memory, that contains the value) for value "Hello there."

        int value = 14;
        sam.jump(value); // "value" - like a bucket (the memory, that contains value) for value "14"
    }
}
