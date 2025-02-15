package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GameShop implements Iterable<String> {
    List<String> games;

    public GameShop() {
        this.games = new ArrayList<>();
    }

    public List<String> getGames() {
        return games;
    }

    public void setGames(List<String> games) {
        this.games = games;
    }

    @Override
    public Iterator<String> iterator() {
        /*return new Iterator<>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index <= games.size() - 1;
            }

            @Override
            public String next() {
                String game = games.get(index);
                index++;
                return game;
            }
        };
         */
        return new Helper();
    }

    private class Helper implements Iterator<String> {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index <= games.size() - 1;
        }

        @Override
        public String next() {
            String game = games.get(index);
            index++;
            return game;
        }
    }
}
