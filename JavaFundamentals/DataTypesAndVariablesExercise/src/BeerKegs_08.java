import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double volume = 0;
        String biggestKeg = "";
        double biggestKegVolume = 0;

        for (int i = 0; i < n; i++) {

            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            volume = Math.PI * (radius * radius) * height;

            if (volume > biggestKegVolume) {
                biggestKegVolume = volume;
                biggestKeg = model;
            }
        }

        System.out.println(biggestKeg);


    }
}
