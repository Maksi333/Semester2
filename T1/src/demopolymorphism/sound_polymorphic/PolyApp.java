package demopolymorphism.sound_polymorphic;

import java.util.ArrayList;

public class PolyApp {

    public static void main(String[] args) {
        System.out.println("POLYMORPHISM\n");

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Donkey());
        animals.add(new Snake());

        for (Animal animal : animals) {
            animal.makeSound(); // makeSound() method is polymorphic
        }
    }
}

