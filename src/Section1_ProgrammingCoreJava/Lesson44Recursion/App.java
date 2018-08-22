package Section1_ProgrammingCoreJava.Lesson44Recursion;
// Recursion - calling the method recursively

/**
 * stack - special area of memory in the JVM which is used for local variables
 * and for remembering which method called which method, so we know where to return after the method is recalled
 * relatively small area of memory that remembers function calls and local variables and stuff like that
 * Usage:
 * -- calculate factorial values
 * -- tower of Hanoi puzzle
 */


// heap - is an area of memory which is where objects are allocated when you use the new operator
public class App {
    public static void main(String[] args) {

        // 4! = 4*3*2*2*1
        System.out.println(factorial(5)); // 120
    }

    private static int factorial(int value) {
        //System.out.println(value);

        if (value == 1) {
            return 1;
        }
        return factorial(value - 1) * value;
    }
}
