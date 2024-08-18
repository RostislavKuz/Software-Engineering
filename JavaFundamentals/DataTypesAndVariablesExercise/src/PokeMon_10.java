import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePowerN = Integer.parseInt(scanner.nextLine());
        int pokeTargetsM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());

        int startPower = pokePowerN;

        int targetsCount = 0;

        while (pokePowerN >= pokeTargetsM) {

            pokePowerN -= pokeTargetsM;
            targetsCount++;

            if (((double) pokePowerN == (double) startPower / 2) && exhaustionFactorY != 0) {
                pokePowerN /= exhaustionFactorY;
            }
        }

        System.out.println(pokePowerN);
        System.out.println(targetsCount);

    }
}
