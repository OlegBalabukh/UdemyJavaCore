public class Lesson36RuntimeVsCheckedExceptions {
    public static void main(String[] args) {

        /*
        * Two kinds of exceptions in java:
        * checked exceptions -- that you forced to handle, lesson 35
        *
        * runtime (unchecked) exceptions -- you don't have to handle them (but you can),
        * so you don't need try/catch blocks;
        * RuntimeExceptions catch serious basic fundamental errors in your program which
        * you want to fix, not to handle
        * */

        // RuntimeExceptions

        //------------------------------------------
        // ArithmeticException
        /*
        int value = 8;
        value = value / 0;
        */

        //------------------------------------------
        // NullPointerException - shows that the pointer ("text" or var in example) is not referencing anything
        /*
        String text = null;
        System.out.println(text.length());
        */

        //------------------------------------------
        // ArrayIndexOutOfBoundsException
        /*
        String[] texts = {"one", "two", "three"};
        System.out.println(texts[3]);
        */

        //------------------------------------------
        // ArrayIndexOutOfBoundsException - with check

        String[] texts = {"one", "two", "three"};

        try {
            System.out.println(texts[3]);
        } catch (Exception /*RuntimeException or ArrayIndexOutOfBoundsException*/ e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }
}
