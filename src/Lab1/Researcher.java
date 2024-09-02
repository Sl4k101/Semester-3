package Lab1;

/**
 * Matthew Cheung 2331037
 */
public class Researcher extends Employee {
    // Defining parameters
    private String field;
    private String publication;

    // Setters
    public Researcher(String name, int age, double salary, String field, String publication) {
        super(name, age, salary);
        this.field = field;
        this.publication = publication;
    }

    // Getters
    public String getField() {
        return field;
    }

    public String getPublication() {
        return publication;
    }

    //hh
    public String toString() {
        return "{Name: " + getName() + " Age: " + getAge() + " Salary: " + getSalary() + " Field: " + field + " Publication: " + publication + "}";
    }
}
