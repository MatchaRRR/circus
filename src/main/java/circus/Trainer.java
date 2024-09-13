package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;
import circus.animal.Parrot;

// Casting
public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck("Donald"); // In the memory, create a duck object.
        getToSpeak(d);

        // b, a, d2 all pointing to the same underlying object(Duck)
        Bird b = (Bird) d;  // upcasting, treating the object of subclass as object of parent calss
        getToSpeak(b);

        Animal a = (Animal) b; // upcasting, treating Bird as an Animal
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting, treating Animal as a Duck
        getToSpeak(d2);

        train(new Duck("Daisy"));
        // train(new animal.Parrot()); // Parrot cannot be cast as a Duck
    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        } else{
            System.out.println("I'm not a Duck! I'm not a Duck!");

        }    }
}
