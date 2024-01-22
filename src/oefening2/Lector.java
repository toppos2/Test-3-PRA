package oefening2;

public class Lector extends Employee{
    private String organisation;

    public Lector(String name, String organisation) {
        super(name);
        this.organisation = organisation;
    }

    @Override
    public boolean hasStudents() {
        return true;
    }

    public String getRole() {
        return "lector";
    }

    @Override
    public String getOrganisation() {
        return organisation+" is a "+getRole();
    }

    @Override
    public String IRole() {
        return null;
    }


}
