package Lab2.Month1;

/**
 * Matthew Cheung 2331037
 */
public class Month1Demo {
    public static void main(String[] args) {
        // Creating objects to be tested
        Month1 month1 = new Month1();
        Month1 month2 = new Month1("October");
        Month1 month3 = new Month1("octeber");
        Month1 month4 = new Month1(14);
        Month1 month5 = new Month1();
        month5.setMonthNumber(7);
        Month1 month6 = new Month1(7);
        Month1 month7 = new Month1(12);

        // Testing the objects
        System.out.println(" ----- Exception Handling for Invalid Month Name -----\n");
        System.out.println("Month1: " + month1.getMonthName());
        System.out.println("Month2: " + month2.getMonthName());
        System.out.println("Month3: " + month3.getMonthName());
        System.out.println("Month4: " + month4);
        System.out.println("Month5: " + month5);
        System.out.println("\n ----- Comparison of Months -----\n");
        System.out.println("Month 7 < month 6: " + month7.lessThan(month6));
        System.out.println("Month 7 > month 6: " + month7.greaterThan(month6));
        System.out.println("Month 6 = month 5: " + month6.equals(month5));
    }
}
