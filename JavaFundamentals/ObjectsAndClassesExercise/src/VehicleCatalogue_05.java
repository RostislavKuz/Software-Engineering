import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicles = new ArrayList<>();
        int carsCount = 0;
        int carsAverageHorsepower = 0;
        int trucksCount = 0;
        int trucksAverageHorsepower = 0;

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] vehicleInfo = input.split(" ");

            if (vehicleInfo[0].equals("car")) {
                vehicleInfo[0] = "Car";
            } else {
                vehicleInfo[0] = "Truck";
            }

            String type = vehicleInfo[0];
            String model = vehicleInfo[1];
            String color = vehicleInfo[2];
            int horsepower = Integer.parseInt(vehicleInfo[3]);

            Vehicle v = new Vehicle(type, model, color, horsepower);
            vehicles.add(v);

            input = scanner.nextLine();
        }

        String vehicleModel = scanner.nextLine();
        while (!vehicleModel.equals("Close the Catalogue")) {

            for (int i = 0; i < vehicles.size(); i++) {
                if (vehicleModel.equals(vehicles.get(i).getModel())) {
                    System.out.printf("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d%n",
                            vehicles.get(i).getType(), vehicles.get(i).getModel(), vehicles.get(i).getColor(), vehicles.get(i).getHorsepower());
                }
            }
            vehicleModel = scanner.nextLine();
        }


        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType().equals("Car")) {
                carsCount++;
                carsAverageHorsepower += vehicle.getHorsepower();
            } else {
                trucksCount++;
                trucksAverageHorsepower += vehicle.getHorsepower();
            }
        }

        if (carsCount > 0) {
            System.out.printf("Cars have average horsepower of: %.2f.%n", carsAverageHorsepower * 1.0 / carsCount);
        } else {
            System.out.printf("Cars have average horsepower of: %.2f.%n", carsAverageHorsepower * 1.0);
        }

        if (trucksCount > 0) {
            System.out.printf("Trucks have average horsepower of: %.2f.", trucksAverageHorsepower * 1.0 / trucksCount);
        } else {
            System.out.printf("Trucks have average horsepower of: %.2f.", trucksAverageHorsepower * 1.0);
        }


    }

    static class Vehicle {
        String type;
        String model;
        String color;
        int horsepower;

        public Vehicle(String type, String model, String color, int horsepower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

        public String getType() {
            return type;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getHorsepower() {
            return horsepower;
        }
    }


}
