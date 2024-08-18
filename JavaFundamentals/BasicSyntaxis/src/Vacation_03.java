import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();

        double price = 0;
        double totalPrice = 0;

        switch (typeOfGroup) {
            case "Students":
                if (dayOfTheWeek.equals("Friday")) {
                    price = 8.45;
                } else if (dayOfTheWeek.equals("Saturday")) {
                    price = 9.80;
                } else if (dayOfTheWeek.equals("Sunday")) {
                    price = 10.46;
                }

                totalPrice = price * peopleCount;

                if (peopleCount >= 30) {
                    totalPrice *= 0.85;
                }
                break;
            case "Business":
                if (dayOfTheWeek.equals("Friday")) {
                    price = 10.90;
                } else if (dayOfTheWeek.equals("Saturday")) {
                    price = 15.60;
                } else if (dayOfTheWeek.equals("Sunday")) {
                    price = 16;
                }

                totalPrice = price * peopleCount;

                if (peopleCount >= 100) {
                    totalPrice -= price * 10;
                }
                break;
            case "Regular":
                if (dayOfTheWeek.equals("Friday")) {
                    price = 15;
                } else if (dayOfTheWeek.equals("Saturday")) {
                    price = 20;
                } else if (dayOfTheWeek.equals("Sunday")) {
                    price = 22.50;
                }

                totalPrice = price * peopleCount;

                if (peopleCount >= 10 && peopleCount <= 20) {
                    totalPrice *= 0.95;
                }
                break;
        }

        System.out.printf("Total price: %.2f", totalPrice);


    }
}
