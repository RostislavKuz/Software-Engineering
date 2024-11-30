package SpeedRacing;

public class Car {
    private String carModel;
    private double fuelAmount;
    private double fuelCostFor1Kilometer;
    private int distanceTraveled;


    public Car(String carModel, double fuelAmount, double fuelCostFor1Kilometer) {
        this.carModel = carModel;
        this.fuelAmount = fuelAmount;
        this.fuelCostFor1Kilometer = fuelCostFor1Kilometer;
        this.distanceTraveled = 0;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }
}
