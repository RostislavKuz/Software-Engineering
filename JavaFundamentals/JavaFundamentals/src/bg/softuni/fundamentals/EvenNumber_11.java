package bg.softuni.fundamentals;

import java.util.Scanner;

public class EvenNumber_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0) {
                System.out.printf("The number is: %d", Math.abs(number));
                break;
            } else {
                System.out.println("Please write an even number.");
            }


        }

    }
}
