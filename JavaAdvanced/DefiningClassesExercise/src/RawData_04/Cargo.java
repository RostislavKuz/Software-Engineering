package RawData_04;

public class Cargo {
    private int CargoWeight;
    private String CargoType;

    public Cargo(int cargoWeight, String cargoType) {
        CargoWeight = cargoWeight;
        CargoType = cargoType;
    }

    public String getCargoType() {
        return CargoType;
    }
}
