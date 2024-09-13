package circus.animal;

import circus.Asset;

// Prevent creating Animal Class instance.
public abstract class Animal implements Asset {

    public String name;
    public abstract String speak();
}
