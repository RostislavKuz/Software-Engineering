import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] setsSize = scanner.nextLine().split("\\s+");
        int firstSetSize = Integer.parseInt(setsSize[0]);
        int secondSetSize = Integer.parseInt(setsSize[1]);

        Set<Integer> firstSet = new LinkedHashSet<>(firstSetSize);
        Set<Integer> secondSet = new LinkedHashSet<>(secondSetSize);

        for (int i = 0; i < firstSetSize; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            firstSet.add(number);
        }

        for (int i = 0; i < secondSetSize; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            secondSet.add(number);
        }

        Set<Integer> duplicateElements = new LinkedHashSet<>();

        for (int number : firstSet) {
            if (secondSet.contains(number)) {
                duplicateElements.add(number);
            }
        }

        //firstSet.retainAll(secondSet);

        duplicateElements.forEach(e -> System.out.print(e + " "));


    }
}
