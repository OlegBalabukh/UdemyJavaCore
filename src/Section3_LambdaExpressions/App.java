package Section3_LambdaExpressions;

// #1, #2
/*
interface Executable {  // functional interface
    void execute();
}

class Runner {
    public void run(Executable e) {
        System.out.println("Executing code block ...");
        e.execute();
    }
}
*/

// #3
/*
interface Executable {
    int execute();
}

class Runner {
    public void run(Executable e) {
        System.out.println("Executing code block ...");
        int value = e.execute();
        System.out.println("Return value is: " + value);
    }
}
*/

/*
// #4
interface Executable {
    int execute(int a);
}

// #5
interface StringExecutable {
    int execute(String a);
}

class Runner {
    public void run(Executable e) {
        System.out.println("Executing code block ...");
        int value = e.execute(11);
        System.out.println("Return value is: " + value);
    }

    public void run(StringExecutable e) {
        System.out.println("Executing code block ...");
        int value = e.execute("Hello!");
        System.out.println("Return value is: " + value);
    }
}
*/

// #6
interface Executable {
    int execute(int a, int b);
}

class Runner {
    public void run(Executable e) {
        System.out.println("Executing code block ...");
        int value = e.execute(11, 12);
        System.out.println("Return value is: " + value);
    }
}

public class App {
    public static void main(String[] args) {

        /*
         * NEW IN JAVA 8:
         * Lambda expressions --
         * is just a way of passing a block of code to a method; that's all they are;
         * are always associated with interfaces that have a single method.
         * like in previous versions, you still have to use interface to pass a block
         * of code to a method, but we got simplified syntax for passing in the
         * actual block of code
         * Functional interface --
         * an interface, that just have one single method
         *
         * Lambda expressions -- is like a "syntactic sugar"
         */

        // #7
        int c = 100;
        // Mustn't do this; c = 8;

        // #8
        int d = 77;

        Runner runner = new Runner();

        // using anonymous class

        // #1, #2
        /*
        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("Hello there.");
            }
        });
        */

        // #3
        /*
        runner.run(new Executable() {
            @Override
            public int execute() {
                System.out.println("Hello there.");
                return  7;
            }
        });
        */

        // #4, #5
        /*
        runner.run(new Executable() {
            @Override
            public int execute(int a) {
                System.out.println("Hello there.");
                return  7 + a;
            }
        });
        */

        // #6, #7, #8
        runner.run(new Executable() {
            @Override
            public int execute(int a, int b) {
                System.out.println("Hello there.");

                // can do this in methods of anonymous classes
                // because anonymous class has its own scope
                int d = 8; // overrides d = 77;

                return  a + b + c;
            }
        });

        System.out.println("=====================================");

        // Or, using lambda expressions

        // #1 = == = == = == = == = == = == = == = == = == = == = == = == = == = ==
        // runner.run(() -> System.out.println("Hello there"));

        // #2 = == = == = == = == = == = == = == = == = == = == = == = == = == = ==
        /*
            runner.run(() -> {
                System.out.println("This is code passed in lambda expression.");
                System.out.println("Hello there");
            });
        */

        // #3 = == = == = == = == = == = == = == = == = == = == = == = == = == = ==
        /*
            runner.run(() -> {
                System.out.println("This is code passed in lambda expression.");
                System.out.println("Hello there");
                return 8;
            });

            // or
            runner.run(() -> {
                return 8;
            });

            // or even
            runner.run(() -> 8);
        */

        // #4 = == = == = == = == = == = == = == = == = == = == = == = == = == = ==
        /*
            runner.run((int a) -> {
                System.out.println("Hello there.");
                return  7 + a;
            });

            // or
            runner.run((a) -> {
                System.out.println("Hello there.");
                return  7 + a;
            });

            // or
            runner.run(a -> {
                System.out.println("Hello there.");
                return  7 + a;
            });
        */

        // #5 = == = == = == = == = == = == = == = == = == = == = == = == = == = ==
        /*
        runner.run((int a) -> { //  Ambiguous method call, so "int a" here
            System.out.println("Hello there.");
            return  7 + a;
        });
        */

        // #6 = == = == = == = == = == = == = == = == = == = == = == = == = == = ==
        /*
        runner.run((a,b) -> { //  Ambiguous method call, so "int a" here
            System.out.println("Hello there.");
            return  a + b;
        });
        */

        // #7 = == = == = == = == = == = == = == = == = == = == = == = == = == = ==
        /*
        runner.run((a,b) -> {
            System.out.println("Hello there.");
            return  a + b + c;
        });
        */

        // #8 = == = == = == = == = == = == = == = == = == = == = == = == = == = ==

        runner.run((a,b) -> {
            System.out.println("Hello there.");
            //int d = 99; // Error: "d" has already been defined; lambda e. haven't own scope
            return  a + b + c;
        });

        // Lambda expression is an object, so we can:
        System.out.println("=====================================");
        Executable ex = (a,b) -> {
            System.out.println("Hello there.");
            return  a + b + c;
        };

        runner.run(ex);

        // Assigning to an object (with cast into Executable):
        Object codeBlock = (Executable)(a,b) -> {
            System.out.println("Hello there.");
            return  a + b + c;
        };
    }
}
