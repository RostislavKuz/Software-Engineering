import java.util.Scanner;

public class DanceHall_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double wardrobeSide = Double.parseDouble(scanner.nextLine());

        double hall = (length * 100) * (width * 100);
        double wardrobe = (wardrobeSide * 100) * (wardrobeSide * 100);
        double bench = hall / 10;

        double freeSpace = hall - wardrobe - bench;

        double dancers = Math.floor(freeSpace / (40 + 7000));

        System.out.printf("%.0f", dancers);




    }
}
