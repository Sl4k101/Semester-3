package Lab2.Bicycle;
/**
 * Matthew Cheung 2331037
 */
public class RaceBike implements Bicycle {
    int speed = 0;
    int gear = 0;

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    public void showSafetyInfo() {
        System.out.println("RaceBike Safety: Wear a race helmet and grease your gears.");
    }

    void printStates() {
        System.out.println("RaceBike state: Speed = " + speed + ", Gear = " + gear);
    }
}
