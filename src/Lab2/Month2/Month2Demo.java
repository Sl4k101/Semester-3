package Lab2.Month2;

/**
 * Matthew Cheung 2331037
 */
public class Month2Demo {
    public static void main(String[] args) {
        // Demonstrating exception handling for invalid month name
        System.out.println(" ----- Exception Handling for Invalid Month Name -----");
        try {
            Month2 month1 = new Month2("Octeber");
            System.out.println("Month1: " + month1.getMonthName());
        } catch (InvalidMonthNameException e) {
            System.out.println("Exception caught:" + e.getMessage());
        }

        // Demonstrating exception handling for invalid month number
        System.out.println("\n ----- Exception Handling for Invalid Month Number -----");
        try {
            Month2 month2 = new Month2(15);
            System.out.println("Month2: " + month2);
        } catch (InvalidMonthNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}