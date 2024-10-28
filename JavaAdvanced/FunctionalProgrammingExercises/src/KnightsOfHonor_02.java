import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split("\\s+");

        Consumer<String> printName = name -> System.out.println("Sir " + name);

        // 1

        /*for (String name : names) {
            printName.accept(name);
        }*/

        // 2
        Arrays.stream(names).forEach(printName);


    }
}
