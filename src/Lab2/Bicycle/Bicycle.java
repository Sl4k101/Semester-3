package Lab2.Bicycle;
/**
 * Matthew Cheung 2331037
 */
public interface Bicycle {
    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);

    void showSafetyInfo(); // New method added
}
