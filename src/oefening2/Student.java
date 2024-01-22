package oefening2;

import java.util.HashMap;
import java.util.Locale;

public class Student extends Person implements IResult {

    private String organisation;
    private HashMap<String, Double> results = new HashMap<>();

    public Student(String name, String organisation) {
        super(name);
        this.organisation = organisation;
    }

    public void addResult(String course, double points) {
        results.put(course, points);
    }

    @Override
    public double getResult(String course) {
        return results.getOrDefault(course, 0.0);
    }

    @Override
    public String getOrganisation() {
        return organisation;
    }






}
