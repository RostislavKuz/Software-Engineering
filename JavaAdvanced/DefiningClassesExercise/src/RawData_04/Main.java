package RawData_04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String carModel = input[0];
            int engineSpeed = Integer.parseInt(input[1]);
            int enginePower = Integer.parseInt(input[2]);
            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];
            List<Tire> tiresList = new ArrayList<>();
            for (int j = 0; j < 8; j += 2) {
                double tirePressure = Double.parseDouble(input[5 + j]);
                int tireAge = Integer.parseInt(input[6 + j]);
                Tire tire = new Tire(tirePressure, tireAge);
                tiresList.add(tire);
            }
            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);

            Car car = new Car(carModel, engine, cargo, tiresList);
            carList.add(car);
        }

        //carList.get(0).getTires().stream().forEach(e -> System.out.println(e.getTirePressure() + " " + e.getTireAge()));
        // test
        /*for (Car car : carList) {
            System.out.println(car.getCarModel());
            System.out.println(car.getCargo().getCargoType());
            car.getTires().stream().forEach(e -> System.out.println(e.getTirePressure() + " " + e.getTireAge()));
        }

         */


        String command = scanner.nextLine();
        switch (command) {
            case "fragile":
                for (Car car : carList) {
                    if (car.getCargo().getCargoType().equals("fragile")) {
                        boolean carWithLowPressureTire = false;
                        for (Tire tire : car.getTires()) {
                            if (tire.getTirePressure() < 1) {
                                carWithLowPressureTire = true;
                            }
                        }
                        if (carWithLowPressureTire) {
                            System.out.println(car.getCarModel());
                        }
                    }
                }
                break;
            case "flamable":
                for (Car car : carList) {
                    if (car.getCargo().getCargoType().equals("flamable")) {
                        if (car.getEngine().getEnginePower() > 250) {
                            System.out.println(car.getCarModel());
                        }
                    }
                }

                break;
        }


    }
}
