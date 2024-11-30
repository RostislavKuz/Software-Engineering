package SpeedRacing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Car> cars = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] information = scanner.nextLine().split("\\s+");
            String carModel = information[0];
            double fuelAmount = Double.parseDouble(information[1]);
            double fuelCostFor1Kilometer = Double.parseDouble(information[2]);
            Car car = new Car(carModel, fuelAmount, fuelCostFor1Kilometer);
            cars.put(carModel, car);
        }

        String[] input = scanner.nextLine().split("\\s+");
        while (!input[0].equals("End")) {
            String carModel = input[1];
            int amountOfKm = Integer.parseInt(input[2]);
            cars.get(carModel).isEnoughFuel(amountOfKm);


            input = scanner.nextLine().split("\\s+");
        }


        cars.entrySet().stream().forEach(car -> System.out.println(car.getKey() + " " + String.format("%.2f", car.getValue().getFuelAmount()) + " " + car.getValue().getDistanceTraveled()));
    }


}
