package $5_AccessModifier_StaticMethod_StaticProperty.ThucHanh.StaticProperty;

public class TestStaticProperty {

    public static void main(String[] args) {

        Car car1 = new Car("Bwm 730li ", " B48");

        System.out.println(car1.getName() + car1.getEngine());

        Car car2 = new Car("Bwm 740li ", " B58");

        System.out.println(car2.getName() + car2.getEngine());

    }
}