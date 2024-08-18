import java.util.Scanner;

public class OnTimeForTheExam_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHours = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHours = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        int examTimeInMinutes = (examHours * 60) + examMinutes;
        int arrivalTimeInMinutes = (arrivalHours * 60) + arrivalMinutes;

        int difference = Math.abs(examTimeInMinutes - arrivalTimeInMinutes);
        boolean isLate = false;

        if (examTimeInMinutes >= arrivalTimeInMinutes && difference <= 30) {
            System.out.println("On time");
        } else if (examTimeInMinutes > arrivalTimeInMinutes && difference > 30) {
            System.out.println("Early");
        } else {
            System.out.println("Late");
            isLate = true;
        }

        if (difference != 0) {
            if (!isLate) {
                if (difference < 60) {
                    System.out.printf("%d minutes before the start", difference);
                } else {
                    System.out.printf("%d:%02d hours before the start", difference / 60, difference % 60);
                }
            } else {
                if (difference < 60) {
                    System.out.printf("%d minutes after the start", difference);
                } else {
                    System.out.printf("%d:%02d hours after the start", difference / 60, difference % 60);
                }
            }
        }


    }
}
