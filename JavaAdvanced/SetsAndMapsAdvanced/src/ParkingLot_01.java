import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> plateNumbers = new LinkedHashSet<>();

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] commandAndPlateNumber = input.split(", ");
            String command = commandAndPlateNumber[0];
            String plateNumber = commandAndPlateNumber[1];

            switch (command) {
                case "IN":
                    plateNumbers.add(plateNumber);
                    break;
                case "OUT":
                    plateNumbers.remove(plateNumber);
                    break;
            }
            input = scanner.nextLine();
        }

        if (!plateNumbers.isEmpty()){
            plateNumbers.stream().forEach(e -> System.out.println(e));
        }else {
            System.out.println("Parking Lot is Empty");
        }


    }
}
