import java.util.*;

public class LegendaryFarming_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> keyMaterials = new HashMap<>();
        Map<String, Integer> junkMaterials = new LinkedHashMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        boolean isObtained = false;

        while (!isObtained) {
            String[] tokens = scanner.nextLine().split("\\s+");

            for (int i = 0; i < tokens.length; i += 2) {
                int quantity = Integer.parseInt(tokens[i]);
                String material = tokens[i + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                   /* keyMaterials.putIfAbsent(material, 0);
                    keyMaterials.put(material, keyMaterials.get(material) + quantity);*/
                    Integer itemQuantity = keyMaterials.get(material);
                    if (itemQuantity == null) {
                        itemQuantity = 0;
                    }
                    keyMaterials.put(material, itemQuantity + quantity);
                    if (keyMaterials.get(material) >= 250) {
                        if (material.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (material.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else {
                            System.out.println("Dragonwrath obtained!");
                        }
                        keyMaterials.put(material, keyMaterials.get(material) - 250);
                        isObtained = true;
                        break;
                    }
                } else {
                    /*junkMaterials.putIfAbsent(material, 0);
                    int currentJunk = junkMaterials.get(material);
                    junkMaterials.put(material, currentJunk + quantity);*/

                    Integer itemQuantity = junkMaterials.get(material);
                    if (itemQuantity == null) {
                        itemQuantity = 0;
                    }
                    junkMaterials.put(material, itemQuantity + quantity);
                }
            }
        }

        System.out.printf("shards: %d%nfragments: %d%nmotes: %d%n",
                keyMaterials.get("shards"), keyMaterials.get("fragments"), keyMaterials.get("motes"));

        junkMaterials.forEach((k, v) -> System.out.println(k + ": " + v));

    }
}
