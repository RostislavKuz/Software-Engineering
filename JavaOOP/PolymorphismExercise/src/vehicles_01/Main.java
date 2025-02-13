package vehicles_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creates a Car
        String[] tokens = scanner.nextLine().split("\\s+");
        Vehicle car = createVehicle(tokens);

        // Creates a Truck
        tokens = scanner.nextLine().split("\\s+");
        Vehicle truck = createVehicle(tokens);

        // Adds vehicles to single data structure
        Map<String, Vehicle> vehicles = new HashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);

        int n = Integer.parseInt(scanner.nextLine());

        // execute commands
        for (int i = 0; i < n; i++) {
            tokens = scanner.nextLine().split("\\s+");
            String commandName = tokens[0];
            String vehicleType = tokens[1];

            switch (commandName) {
                case "Drive":
                    double distance = Double.parseDouble(tokens[2]);
                    String driveMessage = vehicles.get(vehicleType).drive(distance);
                    System.out.println(driveMessage);
                    break;
                case "Refuel":
                    double fuelAmount = Double.parseDouble(tokens[2]);
                    vehicles.get(vehicleType).refuel(fuelAmount);
                    break;
            }
        }

        vehicles.values().forEach(System.out::println);

    }


    private static Vehicle createVehicle(String[] tokens) {
        double fuelQuantity = Double.parseDouble(tokens[1]);
        double fuelConsumption = Double.parseDouble(tokens[2]);

        Vehicle vehicle = null;
        String vehicleType = tokens[0];
        switch (vehicleType) {
            case "Car":
                vehicle = new Car(fuelQuantity, fuelConsumption);
                break;
            case "Truck":
                vehicle = new Truck(fuelQuantity, fuelConsumption);
                break;
        }
        return vehicle;
    }
}
