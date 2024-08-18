import java.util.Scanner;

public class PetShop_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDogs = Integer.parseInt(scanner.nextLine());
        int numberOfOtherAnimals = Integer.parseInt(scanner.nextLine());

        double result = (numberOfDogs * 2.50) + (numberOfOtherAnimals * 4);

        System.out.printf("%.2f lv.", result);
    }
}
