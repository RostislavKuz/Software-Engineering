package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Hero> heroesList = new ArrayList<>();
        Hero firstHero = new Hero("Ben10", 100);
        Hero secondHero = new Hero("SuperMario", 99);
        Hero thirdHero = new Hero("Jax", 120);

        heroesList.add(firstHero);
        heroesList.add(secondHero);
        heroesList.add(thirdHero);

        //Collections.sort(heroesList);

        HeroPowerComparator comparator = new HeroPowerComparator();
        System.out.println(comparator.compare(firstHero, secondHero));
        Collections.sort(heroesList, comparator);
        System.out.println();

    }
}
