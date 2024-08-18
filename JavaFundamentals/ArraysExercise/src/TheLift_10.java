import java.util.Arrays;
import java.util.Scanner;

public class TheLift_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        int[] lift = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();


        boolean hasEmptySpots = false;

        for (int i = 0; i < lift.length; i++) {
            int needSpace = 4 - lift[i];

            if (peopleCount >= needSpace) {
                peopleCount -= needSpace;
                lift[i] += needSpace;
            } else {
                lift[i] += peopleCount;
                peopleCount -= peopleCount;
            }

            if (lift[i] < 4) {
                hasEmptySpots = true;
            }
        }

        if (hasEmptySpots) {
            System.out.println("The lift has empty spots!");
        }

        if (peopleCount > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleCount);
        }

        for (int wagon : lift) {
            System.out.printf("%d ", wagon);
        }


    }
}
