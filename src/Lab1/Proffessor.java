package Lab1;
/**
 * Matthew Cheung 2331037
 */
public class Proffessor extends Employee {
    // Defining parameters
private String department;
private String officeHours;

    // Setters
    public Proffessor(String name, int age, double salary, String department, String officeHours) {
        super(name, age, salary);
        this.department = department;
        this.officeHours = officeHours;
    }

    // Getters
    public String getDepartment() {
        return department;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public String toString() {
        return "{Name: " + getName() + " Age: " + getAge() + " Salary: " + getSalary() + " Office Hours: " + officeHours + " Department: " + department + "}";
    }
}