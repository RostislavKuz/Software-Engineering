import java.util.Scanner;

public class HotelRoom_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double apartmentPerNight = 0;
        double studioPerNight = 0;

        switch (month) {
            case "May":
            case "October":
                apartmentPerNight = 65;
                studioPerNight = 50;
                break;
            case "June":
            case "September":
                apartmentPerNight = 68.70;
                studioPerNight = 75.20;
                break;
            case "July":
            case "August":
                apartmentPerNight = 77;
                studioPerNight = 76;
                break;
        }

        double apartmentTotalPrice = apartmentPerNight * nights;
        double studioTotalPrice = studioPerNight * nights;

        if (nights > 14 && (month.equals("May") || month.equals("October"))) {
            studioTotalPrice *= 0.7;
        } else if (nights > 14 && (month.equals("June") || month.equals("September"))) {
            studioTotalPrice *= 0.8;
        } else if (nights > 7 && (month.equals("May") || month.equals("October"))) {
            studioTotalPrice *= 0.95;
        }
        if (nights > 14) {
            apartmentTotalPrice *= 0.9;
        }

        System.out.printf("Apartment: %.2f lv.%n", apartmentTotalPrice);
        System.out.printf("Studio: %.2f lv.", studioTotalPrice);

    }
}
