import java.util.Scanner;

public class WorldSwimmingRecord_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());

        double delay = (Math.floor(distance / 15) * 12.5);
        double ivansTime = (distance * timePerMeter) + delay;

        if (ivansTime<record){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", ivansTime);
        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", ivansTime - record);
        }


    }
}
