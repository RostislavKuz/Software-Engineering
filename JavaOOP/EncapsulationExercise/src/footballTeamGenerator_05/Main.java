package footballTeamGenerator_05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Team> teams = new HashMap<>();

        while (!input.equals("END")) {
            String[] tokens = input.split(";");
            String commandType = tokens[0];
            String teamName = tokens[1];
            try {
                if (commandType.equals("Team")) {
                    Team team = new Team(teamName);
                    teams.putIfAbsent(teamName, team);
                } else if (commandType.equals("Add")) {
                    if (teams.containsKey(teamName)) {
                        String playerName = tokens[2];
                        int endurance = Integer.parseInt(tokens[3]);
                        int sprint = Integer.parseInt(tokens[4]);
                        int dribble = Integer.parseInt(tokens[5]);
                        int passing = Integer.parseInt(tokens[6]);
                        int shooting = Integer.parseInt(tokens[7]);
                        Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
                        teams.get(teamName).addPlayer(player);
                    } else {
                        throw new IllegalArgumentException("Team " + teamName + " does not exist.");
                    }
                } else if (commandType.equals("Remove")) {
                    teams.get(teamName).removePlayer(tokens[2]);
                } else if (commandType.equals("Rating")) {
                    if (!teams.containsKey(teamName)) {
                        throw new IllegalArgumentException("Team " + teamName + " does not exist.");
                    }
                    System.out.printf("%s - %.0f%n", teamName, teams.get(teamName).getRating());

                }
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
            input = scanner.nextLine();
        }


    }
}
