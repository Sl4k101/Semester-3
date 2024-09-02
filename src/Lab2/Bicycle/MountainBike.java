package Lab2.Bicycle;
/**
 * Matthew Cheung 2331037
 */
public class MountainBike implements Bicycle {
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
        System.out.println("MountainBike Safety: Make sure your tires have enough air and use protective gear.");
    }

    void printStates() {
        System.out.println("MountainBike state: Speed = " + speed + ", Gear = " + gear);
    }
}
