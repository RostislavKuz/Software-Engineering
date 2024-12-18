package waterAdventure;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private String name;
    private int capacity;
    private int size;
    private List<Fish> fishInPool;

    public Aquarium(String name, int capacity, int size, List<Fish> fishInPool) {
        this.name = name;
        this.capacity = capacity;
        this.size = size;
        this.fishInPool = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    public int getFishInPool() {
        return fishInPool.size();
    }

    public void add(Fish fish) {
        boolean haveSameFish = false;
        for (Fish fish1 : fishInPool) {
            if (fish1.getName().equals(fish.getName())) {
                haveSameFish = true;
            }
        }
        if (!haveSameFish && capacity > getFishInPool()) {
            this.fishInPool.add(fish);
        }
    }

    public boolean remove(String name) {
        Fish removedFish = null;
        for (Fish fish : fishInPool) {
            if (fish.getName().equals(name)) {
                removedFish = fish;
            }
        }
        if (removedFish == null) {
            return false;
        } else {
            fishInPool.remove(removedFish);
            return true;
        }
    }
}
