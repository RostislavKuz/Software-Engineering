package bg.softuni.fundamentals;

import java.util.Scanner;

public class TimeAfter30Minutes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int timeInMinutes = (hours * 60) + minutes;
        int timeInMinutesAfter30Min = timeInMinutes + 30;

        int newHours = timeInMinutesAfter30Min / 60;
        if (newHours >= 24) {
            newHours -= 24;
        }

        System.out.printf("%d:%02d", newHours, timeInMinutesAfter30Min % 60);
    }
}
