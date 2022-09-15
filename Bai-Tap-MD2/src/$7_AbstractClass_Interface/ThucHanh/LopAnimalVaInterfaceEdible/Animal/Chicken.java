package $7_AbstractClass_Interface.ThucHanh.LopAnimalVaInterfaceEdible.Animal;


import $7_AbstractClass_Interface.ThucHanh.LopAnimalVaInterfaceEdible.InterFace.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "Thóc ngon!";
    }
}