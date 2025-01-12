import java.util.*;

public class Coins {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] elements = in.nextLine().substring(7).split(", ");
        int[] coins = new int[elements.length];
        for (int i = 0; i < coins.length; i++) {
            coins[i] = Integer.parseInt(elements[i]);
        }

        int targetSum = Integer.parseInt(in.nextLine().substring(5));


        Map<Integer, Integer> usedCoins = chooseCoins(coins, targetSum);

        for (Map.Entry<Integer, Integer> usedCoin : usedCoins.entrySet()) {
            System.out.println(usedCoin.getKey() + " -> " + usedCoin.getValue());
        }
    }

    public static Map<Integer, Integer> chooseCoins(int[] coins, int targetSum) {

        Map<Integer, Integer> coinsCount = new LinkedHashMap<>();

        for (int i = coins.length - 1; i >= 0; i--) {
            int coin = coins[i];

            int coinCount = targetSum / coin;

            if (coinCount != 0) {
                coinsCount.put(coin, coinCount);
            }

            targetSum = targetSum % coin;

        }


        return coinsCount;
    }

    //1:54
}