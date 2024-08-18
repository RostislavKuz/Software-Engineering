import java.util.Arrays;
import java.util.Scanner;

public class TheLift_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        int[] liftWagons = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int freeSpace;
        boolean hasFreeSpace = false;

        for (int i = 0; i < liftWagons.length; i++) {
            if (liftWagons[i] < 4) {
                freeSpace = 4 - liftWagons[i];
                if (peopleCount - freeSpace >= 0) {
                    liftWagons[i] += freeSpace;
                    peopleCount -= freeSpace;
                } else {
                    liftWagons[i] += peopleCount;
                    peopleCount -= peopleCount;
                }
            }
            if (liftWagons[i] < 4) {
                hasFreeSpace = true;
            }
        }

        if (hasFreeSpace && peopleCount <= 0) {
            System.out.println("The lift has empty spots!");
            for (int i = 0; i < liftWagons.length; i++) {
                System.out.printf("%d ", liftWagons[i]);
            }
        } else if (!hasFreeSpace && peopleCount > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleCount);
            for (int i = 0; i < liftWagons.length; i++) {
                System.out.printf("%d ", liftWagons[i]);
            }
        } else if (!hasFreeSpace && peopleCount <= 0) {
            for (int i = 0; i < liftWagons.length; i++) {
                System.out.printf("%d ", liftWagons[i]);
            }
        }


    }
}
