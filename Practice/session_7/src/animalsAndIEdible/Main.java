package animalsAndIEdible;

import animalsAndIEdible.animals.Animal;
import animalsAndIEdible.animals.Chicken;
import animalsAndIEdible.animals.Tiger;
import animalsAndIEdible.fruit.Apple;
import animalsAndIEdible.fruit.Fruit;
import animalsAndIEdible.fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for(Animal a: animals){
            System.out.println(a.makeSound());
            if (a instanceof Chicken){
                System.out.println(((Chicken) a).howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }

    }

}
