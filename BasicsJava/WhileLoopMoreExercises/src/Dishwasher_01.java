import java.util.Scanner;

public class Dishwasher_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int detergentBottles = Integer.parseInt(scanner.nextLine());
        int detergent = detergentBottles * 750;
        int detergentNeed = 0;

        int dishesCount = 0;
        int potsCount = 0;

        int counter = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }
            counter++;
            if (counter % 3 == 0) {
                potsCount += Integer.parseInt(input);
                detergentNeed = detergentNeed + (Integer.parseInt(input) * 15);
            } else {
                dishesCount += Integer.parseInt(input);
                detergentNeed = detergentNeed + (Integer.parseInt(input) * 5);
            }
            if (detergent < detergentNeed) {
                break;
            }
        }

        if (detergent < detergentNeed) {
            System.out.printf("Not enough detergent, %d ml. more necessary!", detergentNeed - detergent);
        } else {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", dishesCount, potsCount);
            System.out.printf("Leftover detergent %d ml.", detergent - detergentNeed);
        }
    }
}
