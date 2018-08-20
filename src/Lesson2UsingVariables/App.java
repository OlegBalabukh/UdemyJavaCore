package Lesson2UsingVariables;

public class App {
    public static void main(String[] args) {
        int myNumber = 88;         // 32 bit value
        short myShort = 847;       // 16 bit value; from -32768 to 32767
        long myLong = 9797;        // 64 bit value

        double myDouble = 7.5968;  // 64 bit value
        float myFloat = 324.3f;    // 32 bit value

        char myChar = 'y';         // 16 bit value; from 0 to 65536
        boolean myBoolean = false; // 8 bit value

        byte myByte = 127;         // 8 bit value; from -128 to 127

        System.out.println(myNumber);
        System.out.println(myShort);
        System.out.println(myLong);
        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myChar);
        System.out.println(myByte);

    }
}
