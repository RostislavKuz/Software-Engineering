package footballTeamGenerator_05;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players = new ArrayList<>();
    }

    private void setName(String name) {
        if (!name.trim().isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("A name should not be empty.");
        }
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(String playerName) {
        boolean isRemoved = false;

        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getName().equals(playerName)) {
                this.players.remove(i);
                isRemoved = true;
            }
        }
        if (!isRemoved) {
            throw new IllegalArgumentException("Player " + playerName + " is not in " + this.name + " team.");
        }
    }

    public double getRating() {
        return Math.round(this.players.stream().mapToDouble(p -> p.overallSkillLevel()).average().orElse(0));
    }
}
