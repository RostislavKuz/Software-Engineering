package wildFarm_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        Animal animal = null;
        List<Animal> animals = new ArrayList<>();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            // {AnimalType} {AnimalName} {AnimalWeight} {AnimalLivingRegion}"
            String animalType = tokens[0];
            String animalName = tokens[1];
            Double animalWeight = Double.parseDouble(tokens[2]);
            String animalLivingRegion = tokens[3];

            switch (animalType) {
                case "Cat":
                    String breed = tokens[4];
                    animal = new Cat(animalName, animalType, animalWeight, animalLivingRegion, breed);
                    break;
                case "Tiger":
                    animal = new Tiger(animalName, animalType, animalWeight, animalLivingRegion);
                    break;
                case "Zebra":
                    animal = new Zebra(animalName, animalType, animalWeight, animalLivingRegion);
                    break;
                case "Mouse":
                    animal = new Mouse(animalName, animalType, animalWeight, animalLivingRegion);
                    break;
            }
            animals.add(animal);
            input = scanner.nextLine();
            tokens = input.split("\\s+");

            String foodType = tokens[0];
            int foodQuantity = Integer.parseInt(tokens[1]);
            Food food;

            if (foodType.equals("Vegetable")) {
                food = new Vegetable(foodQuantity);
            } else {
                food = new Meat(foodQuantity);
            }
            for (Animal animal1 : animals) {
                animal1.makeSound();
            }

            animal.eat(food);


            input = scanner.nextLine();
        }

        animals.forEach(System.out::println);

    }
}
