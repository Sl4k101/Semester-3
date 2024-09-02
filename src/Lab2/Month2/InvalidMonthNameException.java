package Lab2.Month2;

/**
 * Matthew Cheung 2331037
 */
public class InvalidMonthNameException extends Exception {
    public InvalidMonthNameException(String monthName) {
        super("\nInvalid month Name: " + monthName + ".\nMonth name must be a valid month.");
    }
}
