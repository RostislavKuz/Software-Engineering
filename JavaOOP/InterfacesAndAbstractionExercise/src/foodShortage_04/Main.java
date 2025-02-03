package foodShortage_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Citizen> citizens = new ArrayList<>();
        List<Rebel> rebels = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            if (input.length == 4) {
                String name = input[0];
                int age = Integer.parseInt(input[1]);
                String id = input[2];
                String birthdate = input[3];
                Citizen citizen = new Citizen(name, age, id, birthdate);
                citizens.add(citizen);
            } else {
                String name = input[0];
                int age = Integer.parseInt(input[1]);
                String group = input[2];
                Rebel rebel = new Rebel(name, age, group);
                rebels.add(rebel);
            }
        }

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String name = command;
            citizens.stream()
                    .filter(citizen -> citizen.getName().equals(name))
                    .findFirst()
                    .ifPresent(Citizen::buyFood);

            rebels.stream()
                    .filter(rebel -> rebel.getName().equals(name))
                    .findFirst()
                    .ifPresent(Rebel::buyFood);


            command = scanner.nextLine();
        }

        int sum = citizens.stream().mapToInt(Citizen::getFood).sum() + rebels.stream().mapToInt(Rebel::getFood).sum();
        System.out.println(sum);

    }

}
