package Lab1;
/**
 * Matthew Cheung 2331037
 */
public class Employee {
    // Defining parameters
    private String name;
    private int age;
    private double salary;

    // Setters
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "{Name: " + name + " Age: " + age + " Salary: " + salary + "}";
    }
}
