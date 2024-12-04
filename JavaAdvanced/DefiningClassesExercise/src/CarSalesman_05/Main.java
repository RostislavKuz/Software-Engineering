package CarSalesman_05;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Engine> engineList = new ArrayList<>();
        Map<String, Car> carList = new LinkedHashMap<>();


        for (int i = 0; i < n; i++) {
            String[] engineInformation = scanner.nextLine().split("\\s+");
            String engineModel = engineInformation[0];
            int enginePower = Integer.parseInt(engineInformation[1]);
            Engine engine = null;
            if (engineInformation.length == 4) {
                int engineDisplacement = Integer.parseInt(engineInformation[2]);
                String engineEfficiency = engineInformation[3];
                engine = new Engine(engineModel, enginePower, engineDisplacement, engineEfficiency);
            } else if (engineInformation.length == 3) {
                if (Character.isDigit(engineInformation[2].charAt(0))) {
                    int engineDisplacement = Integer.parseInt(engineInformation[2]);
                    engine = new Engine(engineModel, enginePower, engineDisplacement);
                } else {
                    String engineEfficiency = engineInformation[2];
                    engine = new Engine(engineModel, enginePower, engineEfficiency);
                }
            } else {
                engine = new Engine(engineModel, enginePower);
            }
            engineList.add(engine);
        }

        int numberOfCars = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfCars; i++) {
            String[] carInformation = scanner.nextLine().split("\\s+");
            String carModel = carInformation[0];
            String engineModel = carInformation[1];
            Engine engine = null;
            Car car = null;
            for (Engine engine1 : engineList) {
                if (engine1.getEngineModel().equals(engineModel)) {
                    engine = engine1;
                }
            }
            if (carInformation.length == 4) {
                int carWeight = Integer.parseInt(carInformation[2]);
                String carColor = carInformation[3];
                car = new Car(carModel, engine, carWeight, carColor);
            } else if (carInformation.length == 3) {
                if (Character.isDigit(carInformation[2].charAt(0))) {
                    int carWeight = Integer.parseInt(carInformation[2]);
                    car = new Car(carModel, engine, carWeight);
                } else {
                    String carColor = carInformation[2];
                    car = new Car(carModel, engine, carColor);
                }
            } else {
                car = new Car(carModel, engine);
            }
            carList.put(carModel, car);
        }

        carList.entrySet()
                .stream()
                .forEach(car -> {
                    System.out.println(car.getKey() + ":");
                    System.out.println(car.getValue().getEngine().getEngineModel() + ":");
                    System.out.println("Power: " + car.getValue().getEngine().getEnginePower());
                    if (car.getValue().getEngine().getDisplacement() == 0) {
                        System.out.println("Displacement: n/a");
                    } else {
                        System.out.println("Displacement: " + car.getValue().getEngine().getDisplacement());
                    }
                    if (car.getValue().getEngine().getEfficiency() == null) {
                        System.out.println("Efficiency: n/a");
                    } else {
                        System.out.println("Efficiency: " + car.getValue().getEngine().getEfficiency());
                    }
                    if (car.getValue().getWeight() == 0) {
                        System.out.println("Weight: n/a");
                    } else {
                        System.out.println("Weight: " + car.getValue().getWeight());
                    }
                    if (car.getValue().getCarColor() == null) {
                        System.out.println("Color: n/a");
                    } else {
                        System.out.println("Color: " + car.getValue().getCarColor());
                    }
                });
    }
}
