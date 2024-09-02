package Lab2.Month2;

/**
 * Matthew Cheung 2331037
 */
public class InvalidMonthNumberException extends Exception {
    public InvalidMonthNumberException(int monthNumber) {
        super("\nInvalid month number: " + monthNumber + ".\nMonth number must be between 1 and 12.");
    }
}