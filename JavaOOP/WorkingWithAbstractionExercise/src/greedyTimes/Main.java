package greedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long capacity = Long.parseLong(scanner.nextLine());
        String[] itemQuantity = scanner.nextLine().split("\\s+");
        Map<String, LinkedHashMap<String, Long>> treasureBag = new LinkedHashMap<>();

        for (int i = 0; i < itemQuantity.length; i += 2) {
            String itemName = itemQuantity[i];
            long itemAmount = Long.parseLong(itemQuantity[i + 1]);

            String treasure = "";
            treasure = checkTypeOfTreasure(itemName, treasure);
            if (treasure.equals("")) {
                continue;
            } else if (capacity < treasureBag.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + itemAmount) {
                continue;
            }

            switch (treasure) {
                case "Gem":
                    if (!treasureBag.containsKey(treasure)) {
                        if (treasureBag.containsKey("Gold")) {
                            if (checkAmountOfTreasure(treasureBag, itemAmount)) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (treasureBag.get(treasure).values().stream().mapToLong(e -> e).sum() + itemAmount > treasureBag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!treasureBag.containsKey(treasure)) {
                        if (treasureBag.containsKey("Gem")) {
                            if (checkAmountOfTreasure(treasureBag, itemAmount)) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (treasureBag.get(treasure).values().stream().mapToLong(e -> e).sum() + itemAmount > treasureBag.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
            }

            if (!treasureBag.containsKey(treasure)) {
                treasureBag.put((treasure), new LinkedHashMap<>());
            }

            if (!treasureBag.get(treasure).containsKey(itemName)) {
                treasureBag.get(treasure).put(itemName, 0L);
            }


            treasureBag.get(treasure).put(itemName, treasureBag.get(treasure).get(itemName) + itemAmount);
        }

        printItemsInTheBag(treasureBag);
    }

    private static void printItemsInTheBag(Map<String, LinkedHashMap<String, Long>> treasureBag) {
        for (Map.Entry<String, LinkedHashMap<String, Long>> entry : treasureBag.entrySet()) {
            Long sumValues = entry.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.printf("<%s> $%s%n", entry.getKey(), sumValues);

            entry.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }

    private static boolean checkAmountOfTreasure(Map<String, LinkedHashMap<String, Long>> treasureBag, long itemAmount) {
        return itemAmount > treasureBag.get("Gold").values().stream().mapToLong(e -> e).sum();
    }

    private static String checkTypeOfTreasure(String itemName, String treasure) {
        if (itemName.length() == 3) {
            treasure = "Cash";
        } else if (itemName.toLowerCase().endsWith("gem")) {
            treasure = "Gem";
        } else if (itemName.equalsIgnoreCase("gold")) {
            treasure = "Gold";
        }
        return treasure;
    }
}