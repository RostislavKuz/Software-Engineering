import java.util.Scanner;

public class TimePlus15Minutes_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes += 15;

        if (minutes >= 60) {
            minutes -= 60;
            hours++;
        }
        if (hours >= 24) {
            hours -= 24;
        }

        System.out.printf("%d:%02d", hours, minutes);
    }
}
