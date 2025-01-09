import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Bouquets_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tulipsArray = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] daffodilsArray = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        ArrayDeque<Integer> tulips = new ArrayDeque<>();
        ArrayDeque<Integer> daffodils = new ArrayDeque<>();

        for (Integer tulip : tulipsArray) {
            tulips.push(tulip);        //pop
        }
        for (int daffodil : daffodilsArray) {
            daffodils.offer(daffodil);   //poll
        }

        int bouquets = 0;
        int storedFlowers = 0;

        while (!tulips.isEmpty() && !daffodils.isEmpty()) {
            int tulip = tulips.peek();
            int daffodil = daffodils.peek();

            int sum = tulip + daffodil;

            if (sum == 15) {
                bouquets++;
                tulips.pop();
                daffodils.poll();
            } else if (sum > 15) {
                tulips.pop();
                tulips.push(tulip - 2);
            } else {
                storedFlowers += tulip + daffodil;
                tulips.pop();
                daffodils.poll();
            }
            //2:22
        }

        int extraBouquets = storedFlowers / 15;

        bouquets += extraBouquets;

        if (bouquets >= 5) {
            System.out.printf("You made it! You go to the competition with %d bouquets!", bouquets);
        } else {
            System.out.printf("You failed... You need more %d bouquets.", 5 - bouquets);
        }


    }
}
