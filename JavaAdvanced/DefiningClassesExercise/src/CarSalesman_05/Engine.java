package CarSalesman_05;

public class Engine {
    private String engineModel;
    private int enginePower;
    private int displacement;   //
    private String efficiency;  //

    public Engine(String engineModel, int enginePower, int displacement, String efficiency) {
        this.engineModel = engineModel;
        this.enginePower = enginePower;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public Engine(String engineModel, int enginePower, int displacement) {
        this.engineModel = engineModel;
        this.enginePower = enginePower;
        this.displacement = displacement;
    }

    public Engine(String engineModel, int enginePower, String efficiency) {
        this.engineModel = engineModel;
        this.enginePower = enginePower;
        this.efficiency = efficiency;
    }

    public Engine(String engineModel, int enginePower) {
        this.engineModel = engineModel;
        this.enginePower = enginePower;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public int getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }
}
