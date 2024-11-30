package SpeedRacing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Car> cars = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] information = scanner.nextLine().split("\\s+");
            String carModel = information[0];
            double fuelAmount = Double.parseDouble(information[1]);
            double fuelCostFor1Kilometer = Double.parseDouble(information[2]);
            Car car = new Car(carModel, fuelAmount, fuelCostFor1Kilometer);
            cars.put(carModel, car);
        }

        String[] input = scanner.nextLine().split("\\s+");
        while (!input.equals("End")) {
            String carModel = input[1];
            int amountOfKm = Integer.parseInt(input[2]);






            input = scanner.nextLine().split("\\s+");
        }

    }


}
