package carInfo;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Skoda";
        car.model = "Octavia";
        car.setHorsePower(200);

        Car car2 = new Car();
        car2.brand = "BMW";
        car2.model = "520";
        car2.setHorsePower(240);

        String output = String.format("The car is: %s %s - %d HP", car.brand, car.model, car.getHorsePower());
        System.out.println(output);
    }
}
