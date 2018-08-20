package Lesson39TryWithResources.src;

class Temp implements AutoCloseable {  //  AutoCloseable interface specify that your class Temp should have close method

    @Override
    public void close() throws Exception {
        System.out.println("Closing!");
        throw new Exception("Oh no!");
    }
}

public class App {
    public static void main(String[] args) {

        // this is called try with resources
        // with AutoCloseable try-catch block will close automatically
        try(Temp temp = new Temp()) {

        } catch (Exception e) {
            e.printStackTrace();
        }

        /*
        try {
            temp.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
    }
}
