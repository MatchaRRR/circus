package circus.animal;

import circus.Asset;

import java.util.Comparator;

// Prevent creating Animal Class instance.
public abstract class Animal implements Asset {
    public static Comparator<Animal> comparator = new Comparator<Animal>() {
        @Override
        public int compare(Animal animal1, Animal animal2) {
            // This method returns an integer whose sign is that of calling compareTo with case folded versions of the strings
            // where case differences have been eliminated by calling Character. toLowerCase(Character. toUpperCase(int)) on each Unicode code point.
            return animal1.name.compareToIgnoreCase(animal2.name);
        }
    };
    public String name;
    public abstract String speak();
}
