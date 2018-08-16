public class Lesson20StringBuilderAndStringFormatting {
    public static void main(String[] args) {
        String info = "";

        // Inefficient; every time a new string is created
        info += "My name is Bob.";
        info += " ";
        info += "I am a builder.";  // every time a new string is created

        System.out.println(info);

        // More memory efficient way
        StringBuilder sb = new StringBuilder();

        // StringBuilder works as StringBuffer. The first is more lightweight (not thread safe) and newer.
        // StringBuffer is a thread safe version of StringBuilder; it is used if you're creating multi-threaded versions

        sb.append("My name is Sue.");
        sb.append(" ");
        sb.append("I am a lion tamer.");

        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();

        s.append("My name is Gerard.")
                .append(" ")
                .append("I am a skydiver.");

        System.out.println(s.toString());

        /////     Formatting     /////

        System.out.println("Here is some text.\tThat was a tab.\nThat was a newline.");

        System.out.print("Here is some text.\tThat was a tab.\nThat was a newline.");
        System.out.println(" More text");

        // Formatting integers
        System.out.printf("Total cost %-10d; quantity is %d\n", 5, 120);

        for (int i = 0; i < 20; i++) {
            System.out.printf("%2d: some text here\n", i);
        }

        // the same output
        for (int i = 0; i < 20; i++) {
            System.out.printf("%2d: %s\n", i, "here is some text ");
        }

        // Formatting floating point values
        System.out.printf("Total value: %f\n", 5.6);
        System.out.printf("Total value: %.2f\n", 5.6784);
        System.out.printf("Total value: %.2f\n", 335.216784);
    }
}
