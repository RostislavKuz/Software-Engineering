package RawData_04;

import java.util.List;

public class Car {
    private String carModel;
    private Engine engine;
    private Cargo cargo;
    private List<Tire> tires;


    public Car(String carModel, Engine engine, Cargo cargo, List<Tire> tires) {
        this.carModel = carModel;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }

    public Engine getEngine() {
        return engine;
    }

    public List<Tire> getTires() {
        return tires;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public String getCarModel() {
        return carModel;
    }
}
