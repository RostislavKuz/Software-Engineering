import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, int[]> cities = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Sail")) {
            String[] tokens = input.split("\\|\\|");

            String cityName = tokens[0];
            int population = Integer.parseInt(tokens[1]);
            int gold = Integer.parseInt(tokens[2]);

            if (cities.containsKey(cityName)){
                cities.get(cityName)[0]+=population;
                cities.get(cityName)[1]+=gold;
            }else {
                int[] populationAndGold = new int[]{population, gold};
                cities.put(cityName, populationAndGold);
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split("=>");
            String event = tokens[0];
            String townName = tokens[1];

            switch (event) {
                case "Plunder":
                    int peopleKilled = Integer.parseInt(tokens[2]);
                    int goldTaken = Integer.parseInt(tokens[3]);

                    cities.get(townName)[0] -= peopleKilled;
                    cities.get(townName)[1] -= goldTaken;
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",
                            townName, goldTaken, peopleKilled);

                    if (cities.get(townName)[0] <= 0 || cities.get(townName)[1] <= 0) {
                        System.out.printf("%s has been wiped off the map!%n", townName);
                        cities.remove(townName);
                    }
                    break;
                case "Prosper":
                    int goldGiven = Integer.parseInt(tokens[2]);

                    if (goldGiven >= 0) {
                        cities.get(townName)[1] += goldGiven;

                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",
                                goldGiven, townName, cities.get(townName)[1]);
                    } else {
                        System.out.println("Gold added cannot be a negative number!");
                    }
                    break;
            }
            input = scanner.nextLine();
        }


        if (!cities.isEmpty()){
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",
                    cities.size());
            cities.entrySet().
                    forEach(c -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",
                            c.getKey(), c.getValue()[0], c.getValue()[1]));
        }else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }


    }
}
