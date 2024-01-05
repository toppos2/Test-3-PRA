package oefening2;

import java.util.Locale;

abstract public class Figure implements ILength {
    private static int COUNTER = 100;
    private final int id;
    private String name;

    public Figure(String name) {
        COUNTER++;
        this.id = COUNTER;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (ID: " + id + "), length: " + String.format(Locale.US,"%.2f", getLength());
    }
}