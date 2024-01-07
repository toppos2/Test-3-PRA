package oefening2;

import java.util.Locale;

abstract public class Person implements IOrganisation {
    private static int COUNTER = 100;
    private final int id;
    private String name;

    public Person(String name) {
        COUNTER++;
        this.id = COUNTER;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (ID: " + id + "), organisation: " + String.format(Locale.US,"%s", this.getOrganisation());
    }
}