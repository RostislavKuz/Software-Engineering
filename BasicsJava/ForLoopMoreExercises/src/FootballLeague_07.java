import java.util.Scanner;

public class FootballLeague_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());

        int aCount = 0;
        int bCount = 0;
        int vCount = 0;
        int gCount = 0;


        for (int i = 0; i < fans; i++) {

            String sector = scanner.nextLine();

            switch (sector) {
                case "A":
                    aCount++;
                    break;
                case "B":
                    bCount++;
                    break;
                case "V":
                    vCount++;
                    break;
                case "G":
                    gCount++;
                    break;
            }
        }

        double aPercent = aCount * 1.0 / fans * 100;
        double bPercent = bCount * 1.0 / fans * 100;
        double vPercent = vCount * 1.0 / fans * 100;
        double gPercent = gCount * 1.0 / fans * 100;
        double fansPercent = fans * 1.0 / stadiumCapacity * 100;

        System.out.printf("%.2f%%%n", aPercent);
        System.out.printf("%.2f%%%n", bPercent);
        System.out.printf("%.2f%%%n", vPercent);
        System.out.printf("%.2f%%%n", gPercent);
        System.out.printf("%.2f%%%n", fansPercent);

    }
}
