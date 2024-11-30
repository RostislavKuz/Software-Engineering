package SpeedRacing;

import java.util.Map;

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

    public String getCarModel() {
        return carModel;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public double getFuelCostFor1Kilometer() {
        return fuelCostFor1Kilometer;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }


    public void isEnoughFuel(int amountOfKm) {
        double needFuel = fuelCostFor1Kilometer * amountOfKm;
        if (fuelAmount >= needFuel) {
            fuelAmount -= needFuel;
            distanceTraveled += amountOfKm;
        } else {
            System.out.println("Insufficient fuel for the drive");
        }

    }

}
