package Lab1;
/**
 * Matthew Cheung 2331037
 */
public class AdminStaff extends Employee {
    // Defining parameters
    private  String department;
    private String position;

    // Setters
    public AdminStaff(String name, int age, double salary, String department, String position) {
        super(name, age, salary);
        this.department = department;
        this.position = position;
    }

    // Getters
    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }


    public String toString() {
        return "{Name: " + getName() + " Age: " + getAge() + " Salary: " + getSalary() + " Department: " + department + " Position: " + position + "}";
    }
}
