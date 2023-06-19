package TH1;

import TH1.animals.Animal;
import TH1.animals.Chicken;
import TH1.animals.Tiger;
import TH1.edible.IEdible;
import TH1.fruits.Apple;
import TH1.fruits.Fruit;
import TH1.fruits.Orange;

public class Main {
    public static void main(String[] args) {

       Animal[] animals = new Animal[2];
       animals[0] = new Tiger();
       animals[1] = new Chicken();
       for(Animal animal:animals){
           System.out.println(animal.makeSound());
           if(animal instanceof Chicken){
               IEdible edible = (Chicken) animal;
               System.out.println(edible.howToEat());
           }
       }
        Fruit[] fruits = new Fruit[2];
       fruits[0] = new Apple();
       fruits[1] = new Orange();
       for(Fruit fruit:fruits){
           System.out.println(fruit.howToEat());
       }
    }
}