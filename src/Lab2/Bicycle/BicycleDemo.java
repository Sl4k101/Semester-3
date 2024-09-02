package Lab2.Bicycle;
/**
 * Matthew Cheung 2331037
 */
public class BicycleDemo {
    public static void main(String[] args) {
        System.out.println("--- RaceBike Demo ---\n");
        RaceBike raceBike = new RaceBike();
        raceBike.speedUp(20);
        raceBike.changeGear(5);
        raceBike.applyBrakes(5);
        raceBike.showSafetyInfo();
        raceBike.printStates();

        System.out.println("\n--- MountainBike Demo ---\n");
        MountainBike mountainBike = new MountainBike();
        mountainBike.speedUp(15);
        mountainBike.changeGear(3);
        mountainBike.applyBrakes(3);
        mountainBike.showSafetyInfo();
        mountainBike.printStates();
    }
}
