package CarSalesman_05;

public class Car {
    private String carModel;
    private Engine engine;
    private int weight;         //
    private String carColor;    //

    public Car(String carModel, Engine engine, int weight, String carColor) {
        this.carModel = carModel;
        this.engine = engine;
        this.weight = weight;
        this.carColor = carColor;
    }

    public Car(String carModel, Engine engine, int weight) {
        this.carModel = carModel;
        this.engine = engine;
        this.weight = weight;
    }

    public Car(String carModel, Engine engine, String carColor) {
        this.carModel = carModel;
        this.engine = engine;
        this.carColor = carColor;
    }

    public Car(String carModel, Engine engine) {
        this.carModel = carModel;
        this.engine = engine;
    }

    public String getCarModel() {
        return carModel;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getWeight() {
        return weight;
    }

    public String getCarColor() {
        return carColor;
    }
}
