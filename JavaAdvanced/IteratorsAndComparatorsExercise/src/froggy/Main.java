package froggy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        Lake lake = new Lake(numbers);

        StringBuilder builder = new StringBuilder();

        for (Integer integer : lake) {
            builder.append(integer).append(", ");
        }

        System.out.println(builder.subSequence(0, builder.length() - 2));


    }
}
