package TH1.animals;


import TH1.edible.IEdible;

public class Chicken extends Animal implements IEdible {
    @Override
    public String makeSound() {
        return "Chicken!";
    }

    @Override
    public String howToEat() {
        return "Chicken could be fried";
    }
}
