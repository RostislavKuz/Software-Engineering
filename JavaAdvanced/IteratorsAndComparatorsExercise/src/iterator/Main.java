package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GameShop pulsar = new GameShop();
        List<String> games = new ArrayList<>();
        games.add("NBA 2k24");
        games.add("God Of War");
        games.add("FIFA 2024");
        games.add("GTA");
        games.add("Spider Man");
        games.add("Iron Man");

        pulsar.setGames(games);

        Iterator<String> shopAssistant = pulsar.iterator();
        while (shopAssistant.hasNext()) {
            System.out.println(shopAssistant.next());
        }
    }
}
