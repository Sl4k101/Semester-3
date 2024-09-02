package Lab2.Month1;

/**
 * Matthew Cheung 2331037
 */
public class Month1 {
    int monthNumber; // The month number

    // Default constructor that sets the month number to 1 (January).
    public Month1() {
        int monthNumber = 1;
    }

    // Constructor that sets the month number to the given value.
    Month1(int monthNumber) {
        setMonthNumber(monthNumber);
    }

    // Returns the month number.
    public int SetMonthNumber() {
        return monthNumber;
    }

    // Constructor that sets the month number based on the given month name.
    Month1(String monthName) {
        if (monthName.equals("January")) {
            monthNumber = 1;
        } else if (monthName.equals("February")) {
            monthNumber = 2;
        } else if (monthName.equals("March")) {
            monthNumber = 3;
        } else if (monthName.equals("April")) {
            monthNumber = 4;
        } else if (monthName.equals("May")) {
            monthNumber = 5;
        } else if (monthName.equals("June")) {
            monthNumber = 6;
        } else if (monthName.equals("July")) {
            monthNumber = 7;
        } else if (monthName.equals("August")) {
            monthNumber = 8;
        } else if (monthName.equals("September")) {
            monthNumber = 9;
        } else if (monthName.equals("October")) {
            monthNumber = 10;
        } else if (monthName.equals("November")) {
            monthNumber = 11;
        } else if (monthName.equals("December")) {
            monthNumber = 12;
        } else {
            monthNumber = 1;
        }
    }

    // Sets the month number to the given value.
    // If the given value is not between 1 and 12, the month number is set to 1.
    public void setMonthNumber(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            monthNumber = 1;
        }
        this.monthNumber = monthNumber;
    }

    // Returns the month number.
    public int getMonthNumber() {
        return monthNumber;
    }

    // Returns the name of the month.
    public String getMonthName() {
        switch (monthNumber) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "error";
        }
    }

    // Returns a string representation of the month.
    public String toString() {
        return getMonthName();
    }

    // Checks if this month is equal to another object.
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Month1) {
            return this.monthNumber == ((Month1) obj).monthNumber;
        }
        return false;
    }

    // Checks if this month is greater than another month.
    public boolean greaterThan(Object obj) {
        if (obj instanceof Month1) {
            return this.monthNumber > ((Month1) obj).monthNumber;
        }
        return false;
    }

    // Checks if this month is less than another month.
    public boolean lessThan(Object obj) {
        if (obj instanceof Month1) {
            return this.monthNumber < ((Month1) obj).monthNumber;
        }
        return false;
    }
}



