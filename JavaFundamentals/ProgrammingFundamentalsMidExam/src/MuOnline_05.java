
import java.util.Scanner;

public class MuOnline_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int health = 100;
        int bitcoins = 0;

        String[] input = scanner.nextLine().split("\\|");

        int roomsLeft = input.length;
        int room = 0;

        while (health > 0 && roomsLeft > 0) {
            roomsLeft--;


            String[] command = input[room].split(" ");
            room++;

            if (command[0].equals("potion")) {
                int heal = Integer.parseInt(command[1]);
                if (health + heal > 100) {
                    System.out.printf("You healed for %d hp.%n", 100 - health);
                    health = 100;
                    System.out.printf("Current health: %d hp.%n", health);
                } else {
                    health += heal;
                    System.out.printf("You healed for %d hp.%n", heal);
                    System.out.printf("Current health: %d hp.%n", health);
                }
            } else if (command[0].equals("chest")) {
                int foundBitcoins = Integer.parseInt(command[1]);
                bitcoins += foundBitcoins;
                System.out.printf("You found %d bitcoins.%n", foundBitcoins);
            } else {
                String monster = command[0];
                int damage = Integer.parseInt(command[1]);
                if (health - damage > 0) {
                    health -= damage;
                    System.out.printf("You slayed %s.%n", monster);
                } else {
                    health -= damage;
                    System.out.printf("You died! Killed by %s.%n", monster);
                }
            }

        }
        if (health > 0) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d%n", health);
        } else {
            System.out.printf("Best room: %d", room);
        }

        //33:50

    }
}
