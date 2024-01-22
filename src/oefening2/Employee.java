package oefening2;

public abstract class Employee extends Person implements IRole {
    public Employee(String name) {
        super(name);
    }

    public abstract boolean hasStudents();

}
