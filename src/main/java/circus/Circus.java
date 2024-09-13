package circus;

import circus.animal.*;
import circus.stuff.Cannon;
import circus.stuff.Equipment;
import circus.stuff.Ladder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Circus {
    private static Animal[] animals = {
            new Duck("Drake"),
            new Parrot("Polly"),
            new Tiger("Tai Lung")
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
        }
    }

    // If u have a very defined type hierarchy, u can use abstract classes.
    // If u just need a behavior to be specified, u can use interface.
    private static int calculateAssetValue(Asset[] assets) {
        int total = 0;
        for (Asset a : assets) {
            if (a.getValue() <= 5) {
                System.out.println("Ignoring low value item: " + a.getValue());
                continue;
            }
            total += a.getValue();
            System.out.println("Adding item value: " + a.getValue());
        }
        return total;
    }

    private static void printAllAnimals(ArrayList<Animal> animalList) {
        for (Animal a : animalList) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        System.out.println("The total number of animals is " + animals.length);
        // animals[3] = new Elephant("Eli"); // fixed size array, does not work.
        ArrayList<Animal> animalList = new ArrayList<>(Arrays.asList(animals));

        // size and add
        printAllAnimals(animalList);
        System.out.println("Size of animal arrayList is " + animalList.size());
        Elephant elephant = new Elephant("Eli");
        animalList.add(elephant);
        Duck duck = new Duck("Donald");
        animalList.add(duck);
        System.out.println();

        // sorting
        printAllAnimals(animalList);
        System.out.println("Size of animal arrayList is " + animalList.size());
        System.out.println("The index of the elephant in the ArrayList is " + animalList.indexOf(elephant));
        animalList.sort(Animal.comparator); // need a comparator, defined in Animal.java.
        printAllAnimals(animalList); // The ArrayList has been sorted alphabetically.

//        makeAnimalsTalk();
//        System.out.println("Total value of animals " + calculateAssetValue(animals));
//        System.out.println("Total value of equipments " + calculateAssetValue(equipments));
    }
}
// other data structure: HashMap, Key-value paris