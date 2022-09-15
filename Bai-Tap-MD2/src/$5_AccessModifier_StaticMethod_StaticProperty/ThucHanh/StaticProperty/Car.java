package $5_AccessModifier_StaticMethod_StaticProperty.ThucHanh.StaticProperty;

public class Car{
    private String name;
    private String engine;

    public static int numberOfCars;

    public Car(String name, String engine){
        this.name=name;
        this.engine=engine;
        numberOfCars++;
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static void setNumberOfCars(int numberOfCars) {
        Car.numberOfCars = numberOfCars;
    }


}