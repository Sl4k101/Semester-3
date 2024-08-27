package Lab1;
/**
 * Matthew Chueng 2331037
 */
public class Univeristy {
    public static void main(String[] args) {
        // Create objects
Employee employee = new Employee("Matthew", 21, 1000);
Proffessor proffessor = new Proffessor("John", 22, 2000, "Computer Science", "9-5");
Researcher researcher = new Researcher("Chris", 23, 3000, "Biology", "10");
AdminStaff admin = new AdminStaff("Adam", 24, 4000, "Human Resources", "Manager");
        // Print objects
        System.out.println("Employee" + employee.toString());
        System.out.println("Proffessor" + proffessor.toString());
        System.out.println("Ressearcher" + researcher.toString());
        System.out.println("AdminStaff" + admin.toString());
    }
}

