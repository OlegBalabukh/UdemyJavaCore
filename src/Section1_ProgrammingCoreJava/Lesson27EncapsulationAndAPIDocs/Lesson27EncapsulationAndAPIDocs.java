package Section1_ProgrammingCoreJava.Lesson27EncapsulationAndAPIDocs;

class Plant {
    private  String name;
    public static final int ID = 8;

    public  String getData() {
        String data = "some stuff " + calculateGrowthForecast(); // using encapsulated method

        return  data;
    }

    private  int calculateGrowthForecast() { // encapsulation
        return 9;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Lesson27EncapsulationAndAPIDocs {
    public static void main(String[] args) {
        Plant plant = new Plant();
        System.out.println(plant.getData());
    }
}
