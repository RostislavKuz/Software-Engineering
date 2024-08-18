import java.util.Scanner;

public class Hospital_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());
        int treatedPatients = 0;
        int untreatedPatients = 0;

        int doctors = 7;

        for (int i = 1; i <= period; i++) {

            if (i % 3 == 0) {
                if (treatedPatients < untreatedPatients) {
                    doctors++;
                }
            }

            int patients = Integer.parseInt(scanner.nextLine());

            if (patients <= doctors) {
                treatedPatients += patients;
            } else {
                treatedPatients += doctors;
                untreatedPatients += patients - doctors;
            }

        }

        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.", untreatedPatients);
    }
}
